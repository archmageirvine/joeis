package irvine.oeis.a002;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A002988 Number of trimmed trees with n nodes.
 * @author Sean A. Irvine
 */
public class A002988 extends A002955 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  @Override
  public Z next() {
    final int n = size() - 1;
    super.next();
    final Polynomial<Z> b = RING.create(this);
    final Polynomial<Z> g = RING.add(RING.add(RING.one(), b), RING.divide(RING.subtract(b.substitutePower(2, n), RING.pow(b, 2, n)), Z.TWO));
    return g.coeff(n);
  }
}
