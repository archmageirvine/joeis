package irvine.oeis.a079;

import irvine.factor.prime.Fast;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A079159 {a(n)} = sequence of smallest positive integers such that sqrt(1 + Sum_{n&gt;=1} a(n)*p_n*x^n) = A079160(x), a power series also having positive integer coefficients, where p_n is the n-th prime.
 * @author Sean A. Irvine
 */
public class A079159 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Fast mPrime = new Fast();
  private final Polynomial<Q> mS = RING.empty();
  private long mP = 0;
  private int mN = -1;

  protected Z select(final long p, final long k, final Q s) {
    return Z.valueOf(k);
  }

  @Override
  public Z next() {
    ++mN;
    if (mP == 0) {
      mP = 1;
      mS.add(Q.ZERO);
      return Z.ONE;
    }
    mP = mPrime.nextPrime(mP);
    mS.add(new Q(mP));
    long k = 1;
    while (true) {
      final Q sqrt = RING.sqrt1p(mS, mN).coeff(mN);
      if (sqrt.signum() > 0 && sqrt.isInteger()) {
        return select(mP, k, sqrt);
      }
      mS.set(mN, new Q(mP * ++k));
    }
  }
}
