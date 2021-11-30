package irvine.oeis.a337;
// manually egfsim/egfsi at 2021-11-29 19:47

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A337749 a(n) = n! * Sum_{k=0..floor(n/2)} (-1)^k / (n-2*k)!.
 * E.g.f.: exp(x)/(1+x^2)
 * @author Georg Fischer
 */
public class A337749 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    } else {
      mF = mF.multiply(mN);
    }
    return RING.coeff(RING.exp(RING.x(), 4 * mN), RING.onePlusXToTheN(2), mN).multiply(mF).toZ();
  }
}
