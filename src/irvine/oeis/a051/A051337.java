package irvine.oeis.a051;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000568;

/**
 * A051337 Number of strongly connected tournaments on n nodes.
 * @author Sean A. Irvine
 */
public class A051337 extends A000568 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private Polynomial<Z> mB = RING.empty();

  @Override
  public Z next() {
    mB.add(super.next());
    final int n = mB.degree();
    return n == 0 ? Z.ONE : RING.coeff(RING.one(), mB, mN).negate();
  }
}
