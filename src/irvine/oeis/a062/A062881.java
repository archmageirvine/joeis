package irvine.oeis.a062;

import irvine.math.group.DegreeLimitedPolynomialRingField;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062881 Number of partitions of n^2 into exactly n nonzero parts, such that there are at most one 1's, two 2's, ... n-1 n-1's, n n's, n-1 n+1's, ... two 2n-2's and one 2n-1.
 * @author Sean A. Irvine
 */
public class A062881 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final DegreeLimitedPolynomialRingField<Z> inner = new DegreeLimitedPolynomialRingField<>(IntegerField.SINGLETON, mN * mN);
    final PolynomialRingField<Polynomial<Z>> ring = new PolynomialRingField<>("y", inner);
    return ring.product(1, 2 * mN - 1, k -> ring.sum(0, mN - Math.abs(k - mN), j -> ring.monomial(inner.monomial(Z.ONE, k * j), j))).coeff(mN).coeff(mN * mN);
  }
}

