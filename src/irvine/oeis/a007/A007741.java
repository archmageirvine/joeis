package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007741 <code>a(n) =</code> prime(n)*...*prime(m), the least product of consecutive primes which is abundant.
 * @author Sean A. Irvine
 */
public class A007741 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 1;
  private long mN = 0;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    long p = mP;
    final FactorSequence fs = new FactorSequence();
    Z prod = Z.TWO.multiply(mP);
    fs.add(mP, FactorSequence.PRIME);
    long n = ++mN;
    while (true) {
      if (fs.sigma().compareTo(prod) > 0) {
        return prod.divide2();
      }
      p = mPrime.nextPrime(p);
      fs.add(p, FactorSequence.PRIME);
      prod = prod.multiply(p);
      ++n;
    }
  }
}
