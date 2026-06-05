package irvine.oeis.a395;

import irvine.factor.prime.Fast;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.CyclotomicPolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395117 Absolute norms of finite mock theta sums S_p(zeta_p), where p runs through the odd primes.
 * @author Sean A. Irvine
 */
public class A395117 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 2;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    final PolynomialRingField<Z> ring = new PolynomialRingField<>(IntegerField.SINGLETON);
    Polynomial<Z> sum = ring.zero();
    Polynomial<Z> poch = ring.one();
    for (int m = (int) mP - 1; m >= 0; --m) {
      sum = ring.add(sum, poch.shift(m * m));
      if (m > 0) {
        poch = ring.multiply(poch, ring.onePlusXToTheN(m));
      }
    }
    final Polynomial<Z> phi = CyclotomicPolynomials.cyclotomic(mP);
    return ring.resultant(sum, phi).abs();
  }
}
