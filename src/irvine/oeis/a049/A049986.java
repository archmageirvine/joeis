package irvine.oeis.a049;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000217;

/**
 * A049986 a(n) is the number of arithmetic progressions of 4 or more positive integers, strictly increasing with sum n.
 * @author Sean A. Irvine
 */
public class A049986 extends Sequence1 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> gf = RING.zero();
    for (int t, k = 4; (t = A000217.triangular(k).intValueExact()) <= mN; ++k) {
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
