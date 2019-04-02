package irvine.oeis.a007;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;

/**
 * A007446 Exponentiation of e.g.f. for primes.
 * @author Sean A. Irvine
 */
public class A007446 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final A000040 mPrimes = new A000040();
  private Polynomial<Q> mS = RING.zero();
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mF = mF.multiply(mN);
    mS = RING.add(mS, RING.monomial(new Q(mPrimes.next(), mF), mN));
    return RING.exp(mS, mN).coeff(mN).multiply(mF).toZ();
  }
}
