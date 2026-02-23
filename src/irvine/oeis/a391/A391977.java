package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.math.wolfram.TuringMachine;
import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence1;

/**
 * A391977 Maximum value computed by any of the 4096 Wolfram 2-state 2-symbol Turing machines when started with n on the tape.
 * @author Sean A. Irvine
 */
public class A391977 extends Sequence1 implements Conjectural {

  private static final int HEURISTIC_BITS = 5;
  private long mN = 0;

  private Z compute(final TuringMachine tm, final long input, final long maxSteps) {
    tm.initialTape(input);
    long steps = 1;
    while (tm.step() >= 0) {
      if (++steps > maxSteps) {
        return Z.NEG_ONE;
      }
    }
    return tm.readTape();
  }

  @Override
  public Z next() {
    ++mN;
    // Heuristic maximum number of steps
    final long limit = 1L << (2 * Functions.DIGIT_LENGTH.l(2, mN) + HEURISTIC_BITS);
    Z max = Z.ZERO;
    for (int machine = 0; machine < 4096; ++machine) {
      final TuringMachine tm = new TuringMachine(machine);
      if (tm.neverHalts()) {
        continue;
      }
      final Z v = compute(tm, mN, limit);
      if (v.compareTo(max) > 0) {
        max = v;
      }
    }
    return max;
  }
}
