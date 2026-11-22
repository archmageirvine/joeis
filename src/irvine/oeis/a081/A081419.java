package irvine.oeis.a081;

import java.util.Arrays;

import irvine.math.turing.MinskyBusyBeaver;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A081419 Largest value held in any register at the end of a halting computation by an n-instruction register Minsky machine.
 * @author Sean A. Irvine
 * @author Gregory Morse
 */
public class A081419 extends Sequence1 {

  private static final int HALT = 0;
  private static final int INC = 1;
  private static final int DEC = 2;
  private static final int[] HALT_INS = {HALT};

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private long mMaxRegAttained = 0;
  private int mN = 0;
  private int mStepLimit;

  private boolean isViable(final int[][] program) {
    // Check theoretically possible to reach halt
    final boolean[] reached = new boolean[program.length];
    final boolean[] expanded = new boolean[program.length];
    reached[0] = true;
    for (int k = 0; k < reached.length && !reached[reached.length - 1]; ++k) {
      if (reached[k] && !expanded[k]) {
        expanded[k] = true;
        final int[] s = program[k];
        if (s[0] != HALT) {
          reached[s[2]] = true;
          if (s[0] == DEC) {
            reached[s[3]] = true;
          }
        }
      }
    }
    return reached[program.length - 1];
  }

  private void runProgram(final int[][] program, final int maxRegister) {
    final long[] reg = new long[maxRegister + 1];
    int state = 0;

    for (int k = 0; k < mStepLimit; ++k) {
      switch (program[state][0]) {
        case INC:
          ++reg[program[state][1]];
          state = program[state][2];
          break;
        case DEC:
          if (reg[program[state][1]] == 0) {
            state = program[state][3];
          } else {
            --reg[program[state][1]];
            state = program[state][2];
          }
          break;
        case HALT:
        default:
          for (final long v : reg) {
            if (v > mMaxRegAttained) {
              mMaxRegAttained = v;
              if (mVerbose) {
                StringUtils.message("n=" + mN + " program " + Arrays.deepToString(program) + " achieved " + mMaxRegAttained + ": " + Arrays.toString(reg));
              }
            }
          }
          return;
      }
    }
    // Did not terminate in reasonable number of steps
  }

  private void buildProgram(final int[][] program, final int pos, final int maxRegister) {
    if (pos + 1 == mN) {
      // WLOG last instruction is HALT
      program[pos] = HALT_INS;
      if (isViable(program)) {
        runProgram(program, maxRegister);
      }
      return;
    }
    // Try each possible instruction in turn

    // HALT
//    // There is no point having more than one halt instruction in this model,
//    // such a slot could always be better utilized providing some other operation
//    program[pos] = HALT_INS;
//    buildProgram(program, pos + 1, maxRegister);

    // INCREMENT
    for (int reg = 0; reg <= maxRegister; ++reg) {
      for (int nextState = 0; nextState < program.length; ++nextState) {
        if (nextState != pos) { // increment in same state never halts
          program[pos] = new int[] {INC, reg, nextState};
          buildProgram(program, pos + 1, maxRegister + 1);
        }
      }
    }
    // DECREMENT
    for (int reg = 0; reg <= maxRegister; ++reg) {
      for (int nextState = 0; nextState < program.length; ++nextState) {
        for (int zeroState = 0; zeroState < program.length; ++zeroState) {
          if (zeroState != pos) { // avoid looping to self once zero is reached
            program[pos] = new int[] {DEC, reg, nextState, zeroState};
            buildProgram(program, pos + 1, maxRegister + 1);
          }
        }
      }
    }
  }

  @Override
  public Z next() {
    final MinskyBusyBeaver verified = MinskyBusyBeaver.compute(++mN);
    if (mN > 4) {
      return Z.valueOf(verified.maximumScore());
    }
    // Keep the original exhaustive search at the small sizes, using the
    // independently verified time bound (plus the final HALT instruction).
    mStepLimit = verified.maximumSteps() + 1;
    mMaxRegAttained = 0;
    buildProgram(new int[mN][], 0, 0);
    return Z.valueOf(mMaxRegAttained);
  }
}
