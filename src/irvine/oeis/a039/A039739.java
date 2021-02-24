package irvine.oeis.a039;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A039739 a(n)=2q-p(n), where q is the prime &lt; p(n) for which (p(n) mod q) is maximal.
 * @author Sean A. Irvine
 */
public class A039739 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 2;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    long max = 0;
    long maxq = 0;
    for (long q = 2; q < mP; q = mPrime.nextPrime(q)) {
      final long r = mP % q;
      if (r > max) {
        max = r;
        maxq = q;
      }
    }
    return Z.valueOf(2 * maxq - mP);
  }
}
