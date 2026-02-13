package irvine.oeis.a393;

import irvine.math.function.Functions;
import irvine.math.wolfram.TuringMachine;
import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence1;

/**
 * A083747.
 * @author Sean A. Irvine
 */
public class A393376 extends Sequence1 implements Conjectural {

  private static final int HEURISTIC_BITS = 5;
  private long mN = 0;

  private long computeMaxPosition(final TuringMachine tm, final long input, final long maxSteps) {
    tm.initialTape(input);
    long max = 0;
    long steps = 1;
    long pos;
    while ((pos = tm.step()) >= 0) {
      if (++steps > maxSteps) {
        return 0;
      }
      if (pos > max) {
        max = pos;
      }
    }
    return max;
  }

  @Override
  public Z next() {
    ++mN;
    // Heuristic maximum number of steps
    final long limit = 1L << (2 * Functions.DIGIT_LENGTH.l(2, mN) + HEURISTIC_BITS);
    long max = 0;
    for (int machine = 0; machine < 4096; ++machine) {
      final TuringMachine tm = new TuringMachine(machine);
      if (tm.neverHalts()) {
        continue;
      }
      final long v = computeMaxPosition(tm, mN, limit);
      if (v > max) {
        max = v;
      }
    }
    return Z.valueOf(max);
  }
}
