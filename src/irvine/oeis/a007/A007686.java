package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007686 Prime(n)*...*a(n) is the least product of consecutive primes which is non-deficient.
 * @author Sean A. Irvine
 */
public class A007686 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 1;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    long p = mP;
    final FactorSequence fs = new FactorSequence();
    Z prod = Z.TWO.multiply(mP);
    fs.add(mP, FactorSequence.PRIME);
    while (true) {
      if (fs.sigma().compareTo(prod) >= 0) {
        return Z.valueOf(p);
      }
      p = mPrime.nextPrime(p);
      fs.add(p, FactorSequence.PRIME);
      prod = prod.multiply(p);
    }
  }
}
