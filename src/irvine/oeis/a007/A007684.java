package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007684 <code>Prime(n)*...*prime(a(n))</code> is the least product of consecutive primes that is non-deficient.
 * @author Sean A. Irvine
 */
public class A007684 implements Sequence {

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
      if (fs.sigma().compareTo(prod) >= 0) {
        return Z.valueOf(n);
      }
      p = mPrime.nextPrime(p);
      fs.add(p, FactorSequence.PRIME);
      prod = prod.multiply(p);
      ++n;
    }
  }
}
