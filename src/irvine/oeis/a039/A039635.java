package irvine.oeis.a039;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A039635 Fixed point of "n -&gt; n/2 or (n+1)/2 until result is prime".
 * @author Sean A. Irvine
 */
public class A039635 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    while (m > 3 && !mPrime.isPrime(m)) {
      m = (m + 1) >>> 1;
    }
    return Z.valueOf(m);
  }
}
