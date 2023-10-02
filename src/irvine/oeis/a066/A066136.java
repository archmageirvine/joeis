package irvine.oeis.a066;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066136 Primes are replaced by their local sequence number in A000040, while composites are replaced by their sequence number in A002808; (a kind of eigen- or home-indexing).
 * @author Sean A. Irvine
 */
public class A066136 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mPrimeCount = 0;

  @Override
  public Z next() {
    if (mPrime.isPrime(++mN)) {
      return Z.valueOf(++mPrimeCount);
    } else {
      return Z.valueOf(mN - mPrimeCount - 1);
    }
  }
}
