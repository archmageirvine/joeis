package irvine.oeis.a118;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A118874 A halting sequence for Cutland's numbering of register machines.
 * @author Gregory Morse
 */
public class A118874 extends LambdaSequence {

  private static final int ZERO = 0;
  private static final int SUCCESSOR = 1;
  private static final int TRANSFER = 2;
  private static final int JUMP = 3;

  /** Construct the sequence. */
  public A118874() {
    super(0, A118874::evaluate);
  }

  private static int left(final int packed) {
    return Integer.numberOfTrailingZeros(packed + 1);
  }

  private static int right(final int packed) {
    return (packed + 1) >>> (left(packed) + 1);
  }

  private static final class Instruction {
    private final int mKind;
    private final int mA;
    private final int mB;
    private final int mJump;

    private Instruction(final int encoded) {
      mKind = encoded & 3;
      final int u = encoded >>> 2;
      if (mKind == TRANSFER) {
        mA = left(u);
        mB = right(u);
        mJump = -1;
      } else if (mKind == JUMP) {
        final int pair = left(u);
        mA = left(pair);
        mB = right(pair);
        mJump = right(u);
      } else {
        mA = u;
        mB = u;
        mJump = -1;
      }
    }
  }

  private static boolean[] possiblyHalts(final List<Instruction> program) {
    final boolean[] reachesExit = new boolean[program.size() + 1];
    reachesExit[program.size()] = true;
    // Every possible path to the outside contains a simple path.
    for (int k = 0; k < program.size(); ++k) {
      for (int i = program.size() - 1; i >= 0; --i) {
        final Instruction op = program.get(i);
        if (op.mKind == JUMP) {
          reachesExit[i] |= op.mJump >= program.size() || reachesExit[op.mJump];
        }
        if (op.mKind != JUMP || op.mA != op.mB) {
          reachesExit[i] |= reachesExit[i + 1];
        }
      }
    }
    return reachesExit;
  }

  private static Z evaluate(final long n) {
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    final List<Instruction> program = new ArrayList<>();
    int registers = 1;
    // Invert tau by reading the zero runs before the 1 bits in n+1,
    // from least to most significant.
    for (long bits = Math.addExact(n, 1); bits != 0;) {
      final int encoded = Long.numberOfTrailingZeros(bits);
      final Instruction op = new Instruction(encoded);
      program.add(op);
      registers = Math.max(registers, 1 + Math.max(op.mA, op.mB));
      bits >>>= encoded + 1;
    }
    final boolean[] reachesExit = possiblyHalts(program);
    final List<Set<List<Z>>> seen = new ArrayList<>();
    for (int i = 0; i < program.size(); ++i) {
      seen.add(new HashSet<>());
    }
    final Z[] values = new Z[registers];
    Arrays.fill(values, Z.ZERO);
    values[0] = Z.valueOf(n);
    int pc = 0;
    for (int steps = 0; steps < 10_000; ++steps) {
      if (pc >= program.size()) {
        return values[0].add(1);
      }
      if (!reachesExit[pc] || !seen.get(pc).add(List.of(values.clone()))) {
        return Z.ZERO;
      }
      final Instruction op = program.get(pc++);
      switch (op.mKind) {
        case ZERO:
          values[op.mA] = Z.ZERO;
          break;
        case SUCCESSOR:
          values[op.mA] = values[op.mA].add(1);
          break;
        case TRANSFER:
          values[op.mB] = values[op.mA];
          break;
        case JUMP:
          if (values[op.mA].equals(values[op.mB])) {
            pc = op.mJump;
          }
          break;
        default:
          throw new IllegalStateException();
      }
    }
    throw new UnsupportedOperationException("Halting of the decoded program is unresolved");
  }
}
