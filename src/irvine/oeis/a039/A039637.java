package irvine.oeis.a039;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A039637 Number of steps to fixed point of "n -&gt; n/2 or (n+1)/2 until result is prime".
 * @author Sean A. Irvine
 */
public class A039637 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    long c = 1;
    while (m > 3 && !mPrime.isPrime(m)) {
      m = (m + 1) >>> 1;
      ++c;
    }
    return Z.valueOf(c);
  }
}
