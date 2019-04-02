package irvine.oeis.a085;

import irvine.math.z.Z;

/**
 * A085588 Maximal cycle lengths in a certain class of one-dimensional cellular automata.
 * @author Sean A. Irvine
 */
public class A085588 extends A085587 {

  @Override
  protected Z step(final Z state) {
    final Z a = state.divide2().or(state.and(Z.ONE).shiftLeft(mN - 1));
    final Z b = state.clearBit(mN - 1).multiply2().add(state.testBit(mN - 1) ? 1 : 0);
    return a.xor(b).xor(state);
  }
}
