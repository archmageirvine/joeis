package irvine.oeis.a393;

import irvine.math.wolfram.TuringMachine;
import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence1;

/**
 * A393317 Maximum halting time for any of the 4096 Wolfram 2-state 2-symbol Turing machines across all n-bit inputs.
 * @author Sean A. Irvine
 */
public class A393317 extends Sequence1 implements Conjectural {

  private static final int HEURISTIC_BITS = 5;
  private int mN = 0;

  private long countSteps(final TuringMachine tm, final long input, final long maxSteps) {
    tm.initialTape(input);
    long steps = 1;
    while (tm.step() >= 0) {
      if (++steps > maxSteps) {
        return -1;
      }
    }
    return steps;
  }

  @Override
  public Z next() {
    ++mN;
    long max = 0;
    for (int machine = 0; machine < 4096; ++machine) {
      final TuringMachine tm = new TuringMachine(machine);
      if (tm.neverHalts()) {
        continue;
      }
      for (long input = 1; input < 1L << mN; ++input) {
        final long steps = countSteps(tm, input, 1L << (mN + HEURISTIC_BITS));
        if (steps > max) {
          max = steps;
        }
      }
    }
    return Z.valueOf(max);
  }
}
