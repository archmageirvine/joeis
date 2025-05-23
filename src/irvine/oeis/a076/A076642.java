package irvine.oeis.a076;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076642 Coefficient of x^a(n) in (x+1/3!)*(x+2/3!)*...*(x+n/3!) is the largest one.
 * @author Sean A. Irvine
 */
public class A076642 extends Sequence1 {

  private static final PolynomialRing<Q> RING = new PolynomialRing<>(Rationals.SINGLETON);
  private long mN = 0;
  private Polynomial<Q> mA = RING.one();

  @Override
  public Z next() {
    mA = RING.multiply(mA, Polynomial.create(new Q(++mN, 6), Q.ONE));
    Q max = Q.ZERO;
    int maxK = 0;
    for (int k = 0; k <= mA.degree(); ++k) {
      if (mA.coeff(k).compareTo(max) > 0) {
        max = mA.coeff(k);
        maxK = k;
      }
    }
    return Z.valueOf(maxK);
  }
}
