package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.a005.A005117;

/**
 * A033197 Discriminants of quadratic number fields Q(sqrt -n) for n squarefree.
 * @author Sean A. Irvine
 */
public class A033197 extends A005117 {

  private static final Z Z3 = Z.valueOf(-3);

  @Override
  public Z next() {
    final Z n = super.next().negate();
    return n.remainder(Z.FOUR).equals(Z3) ? n : n.multiply(4);
  }
}
