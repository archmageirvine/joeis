package irvine.oeis.a048;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048198 Number of primes between successive n's, where n mod 10 = 5.
 * @author Sean A. Irvine
 */
public class A048198 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN; // we want between
    int c = 0;
    do {
      if (mPrime.isPrime(mN)) {
        ++c;
      }
    } while (++mN % 10 != 5);
    return Z.valueOf(c);
  }
}
