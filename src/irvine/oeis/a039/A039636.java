package irvine.oeis.a039;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A039636 Number of steps to fixed point of "n -&gt; n/2 or (n-1)/2 until result is prime".
 * @author Sean A. Irvine
 */
public class A039636 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    long c = 1;
    while (m > 3 && !mPrime.isPrime(m)) {
      m >>>= 1;
      ++c;
    }
    return Z.valueOf(c);
  }
}
