package irvine.oeis.a033;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033559 a(n) = (q - p)/2, where p is the largest prime &lt; n and q is the smallest prime &gt; n.
 * @author Sean A. Irvine
 */
public class A033559 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 3;

  @Override
  public Z next() {
    return Z.valueOf((mPrime.nextPrime(++mN) - mPrime.prevPrime(mN)) / 2);
  }
}
