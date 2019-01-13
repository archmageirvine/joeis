package irvine.oeis.a014;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a020.A020556;

/**
 * A014500.
 * @author Sean A. Irvine
 */
public class A014500 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> A = RING.create(Arrays.asList(Q.ZERO, Q.HALF));
  private Z mF = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    Polynomial<Q> sum = RING.zero();
    Z f = Z.ONE;
    final A020556 a20556 = new A020556();
    for (int k = 0; k <= mN + 1; ++k) {
      if (k > 1) {
        f = f.multiply(k);
      }
      final Polynomial<Q> logPower = RING.pow(RING.multiply(RING.log1p(RING.x(), mN), Q.HALF), k, mN);
      sum = RING.add(sum, RING.multiply(RING.multiply(logPower, new Q(a20556.next())), new Q(Z.ONE, f)));
    }
    final Polynomial<Q> egf = RING.multiply(sum, RING.exp(A, mN), mN);
    return egf.coeff(mN).multiply(mF).toZ();
  }
}
