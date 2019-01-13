package irvine.oeis.a007;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a000.A000111;

/**
 * A007999.
 * @author Sean A. Irvine
 */
public class A007999 extends A000111 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> C = RING.monomial(Q.ONE, 2);
  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    super.next();
    final Polynomial<Q> u = RING.multiply(RING.log(RING.series(RING.onePlusXToTheN(1), RING.oneMinusXToTheN(1), mN), mN), Q.HALF);
    Polynomial<Q> odd = RING.zero();
    Polynomial<Q> even = RING.zero();
    Polynomial<Q> uPower = RING.one();
    Z mF = Z.ONE;
    // Computes both even and odd terms of the g.f. even though on any particular
    // iteration we only actually need one or other of them.
    for (int k = 0; k <= mN; ++k) {
      if (k > 0) {
        uPower = RING.multiply(uPower, u, mN);
        mF = mF.multiply(k);
      }
      final Z euler = mA.get(k).square();
      final Polynomial<Q> t = RING.multiply(uPower, new Q(euler, mF));
      if ((k & 1) == 0) {
        even = RING.add(even, t);
      } else {
        odd = RING.add(odd, t);
      }
    }
    even = RING.series(even, RING.sqrt1m(C, mN), mN);
    return even.coeff(mN).add(odd.coeff(mN)).toZ();
  }
}
