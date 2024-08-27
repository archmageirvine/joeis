package irvine.oeis.a085;

import irvine.math.z.Z;

/**
 * A085588 Eventual period of a single cell in rule 150 cellular automaton in a cyclic universe of width n.
 * @author Sean A. Irvine
 */
public class A085588 extends A085587 {

  /** Construct the sequence. */
  public A085588() {
    super(3);
  }

  {
    super.next();
    super.next();
  }

  @Override
  protected Z step(final Z state) {
    final Z a = state.divide2().or(state.and(Z.ONE).shiftLeft(mN - 1));
    final Z b = state.clearBit(mN - 1).multiply2().add(state.testBit(mN - 1) ? 1 : 0);
    return a.xor(b).xor(state);
  }
}
