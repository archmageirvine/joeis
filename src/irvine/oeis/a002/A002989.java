package irvine.oeis.a002;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a052.A052321;

/**
 * A002989 Number of n-node trees with a forbidden limb of length 3.
 * @author Sean A. Irvine
 */
public class A002989 extends A052321 {

  {
    setOffset(0);
  }

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  @Override
  public Z next() {
    final int n = size() - 1;
    super.next();
    final Polynomial<Z> b = RING.create(toList());
    final Polynomial<Z> g = RING.add(RING.add(RING.one(), b), RING.divide(RING.subtract(b.substitutePower(2, n), RING.pow(b, 2, n)), Z.TWO));
    return g.coeff(n);
  }
}
