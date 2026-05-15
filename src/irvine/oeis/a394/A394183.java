package irvine.oeis.a394;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394183 Maximum number of steps before halting among all 2-state 2-symbol Turing machines on an n-cell circular tape, over all binary starting tapes and starting head positions.
 * @author Sean A. Irvine
 */
public class A394183 extends Sequence1 {

  // After Reed Silverstein

  private int mN = 0;
  private long mMax = 0;
  private long mLimit = 0;

  private long time(final boolean[] write, final int[] move, final int[] next, int tape) {
    int pos = 0;
    int state = 0;
    long steps = 0;
    while (steps < mLimit) {
      final int symbol = (tape >>> pos) & 1;
      final int s = (state << 1) + symbol;
      if (write[s]) {
        tape |= 1 << pos;
      } else {
        tape &= ~(1 << pos);
      }
      pos += move[s];
      if (pos >= mN) {
        pos -= mN;
      }
      state = next[s];
      ++steps;
      if (state == 2) {
        return steps;
      }
    }
    return -1;
  }

  private void run(int machine) {
    // Decode the machine
    final boolean[] write = new boolean[4];
    final int[] move = new int[4];
    final int[] state = new int[4];
    for (int k = 0; k < write.length; ++k) {
      int c = machine % 12;
      write[k] = (c & 1) == 1;
      c >>>= 1;
      move[k] = (c & 1) == 0 ? 1 : mN - 1; // i.e., +1 or -1 (mod mN)
      c >>>= 1;
      state[k] = c;
      machine /= 12;
    }
    // Run against every tape
    for (int tape = 0; tape <= 1 << mN; ++ tape) {
      final long time = time(write, move, state, tape);
      if (time > mMax) {
        mMax = time;
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    mLimit = (long) mN << (mN + 1);
    mMax = 0;
    for (int machine = 0; machine < 20736; ++machine) {
      run(machine);
    }
    return Z.valueOf(mMax);
  }
}
