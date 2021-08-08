package irvine.oeis.a049;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000217;

/**
 * A049980 a(n) is the number of arithmetic progressions of positive integers, strictly increasing with sum n.
 * @author Sean A. Irvine
 */
public class A049980 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> X1 = RING.oneMinusXToTheN(1);
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> gf = RING.series(RING.x(), X1, mN);
    for (int t, k = 2; (t = A000217.triangular(k).intValueExact()) <= mN; ++k) {
      final long[] den = new long[t + 1];
      den[t] = 1;
      den[A000217.triangular(k - 1).intValueExact()] = -1;
      den[k] -= 1;
      den[0] = 1;
      gf = RING.add(gf, RING.series(RING.monomial(Z.ONE, t), Polynomial.create(den), mN));
    }
    return gf.coeff(mN);
  }
}
