package irvine.oeis.a060;

import irvine.math.group.DegreeLimitedPolynomialRingField;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a007.A007504;

/**
 * A060627 1 + Sum_{n &gt;= 1} Sum_{k = 0..n-1} (-1)^n*T(n,k)*y^(2*k)*x^(2*n)/(2*n)! = JacobiCN(x,y).
 * @author Sean A. Irvine
 */
public class A060627 extends A007504 {

  private int mN = 0;
  private int mM = 0;
  private Polynomial<Polynomial<Z>> mGf = null;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
      // H. S. Wall, continued fraction expansion
      final DegreeLimitedPolynomialRingField<Z> inner = new DegreeLimitedPolynomialRingField<>("k", IntegerField.SINGLETON, 2 * mN - 2);
      final PolynomialRingField<Polynomial<Z>> ring = new PolynomialRingField<>(inner);
      Polynomial<Polynomial<Z>> t = ring.one();
      for (int k = mN; k > 0; --k) {
        t = ring.subtract(ring.one(), ring.series(ring.monomial(inner.monomial(Z.valueOf((long) k * k), (k & 1) == 0 ? 2 : 0), 1), t, mN));
      }
      mGf = ring.series(ring.one(), t, mN);
    }
    return mGf.coeff(mN).coeff(2 * mM);
  }
}
