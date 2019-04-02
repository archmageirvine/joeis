package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010760 Maximal cycle length for a ring of n binary cellular automata.
 * @author Sean A. Irvine
 */
public class A010760 implements Sequence {

  protected int mN = 0;

  protected Z step(final Z state) {
    final Z a = state.divide2().or(state.and(Z.ONE).shiftLeft(mN - 1));
    final Z b = state.clearBit(mN - 1).multiply2().add(state.testBit(mN - 1) ? 1 : 0);
    return a.xor(b);
  }

  private long getPeriod() {
    // Find a starting state somewhere on a cycle
    Z state = Z.ONE;
    Z kangaroo = step(state);
    while (!kangaroo.equals(state)) {
      state = step(state);
      kangaroo = step(step(kangaroo));
    }
    // Count the length of the cycle
    long period = 0;
    do {
      kangaroo = step(kangaroo);
      ++period;
    } while (!kangaroo.equals(state));
    return period;
  }

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(getPeriod());
  }

}
