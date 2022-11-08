package irvine.oeis.a060;

import irvine.math.group.DegreeLimitedPolynomialRingField;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060287 Triangle formed from coefficients in expansion of Product_{i=3..infinity, j=0..i} 1/(1-x^(i-j)*y^j).
 * @author Sean A. Irvine
 */
public class A060287 extends Sequence0 {

  private Polynomial<Polynomial<Z>> mGf = null;
  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
      final DegreeLimitedPolynomialRingField<Z> inner = new DegreeLimitedPolynomialRingField<>("y", IntegerField.SINGLETON, mN);
      final PolynomialRingField<Polynomial<Z>> ring = new PolynomialRingField<>(inner);
      Polynomial<Polynomial<Z>> den = ring.one();
      for (int k = 3; k <= mN; ++k) {
        for (int j = 0; j <= k; ++j) {
          den = ring.multiply(den, ring.oneMinusXToTheN(inner.monomial(Z.ONE, j), k - j));
        }
      }
      mGf = ring.series(ring.one(), den, mN);
    }
    return mGf.coeff(mN - mM).coeff(mM);
  }
}
