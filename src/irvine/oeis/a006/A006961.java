package irvine.oeis.a006;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a001.A001190;

/**
 * A006961 Number of mappings from n points to themselves with in-degree &lt;= 2.
 * @author Sean A. Irvine
 */
public class A006961 extends A001190 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  @Override
  public Z next() {
    super.next();
    final int n = size() - 1;
    final Polynomial<Z> t = RING.create(toList());
    Polynomial<Z> g = RING.one();
    for (int k = 1; k <= n; ++k) {
      g = RING.multiply(g, RING.subtract(RING.one(), t.substitutePower(k, mN)), mN);
    }
    return RING.coeff(RING.one(), g, n);
  }
}
