package irvine.oeis.a003;

import java.util.Collections;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003430.
 * @author Sean A. Irvine
 */
public class A003430 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> TWO = RING.create(Collections.singletonList(Q.TWO));

  private Polynomial<Q> mA = RING.one();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Q> a = RING.zero();
    for (int k = 1; k <= mN; ++k) {
      final Polynomial<Q> ak = mA.substitutePower(k, mN);
      final Polynomial<Q> t = RING.add(RING.add(ak, RING.series(RING.one(), ak, mN)), RING.subtract(RING.monomial(Q.ONE, k), TWO));
      a = RING.add(a, RING.divide(t, new Q(k)));
    }
    mA = RING.exp(a, mN);
    //System.out.println("gf=" + mA);
    return mA.coeff(mN).toZ();
  }
}
