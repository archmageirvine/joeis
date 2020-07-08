package irvine.oeis.a033;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033559 <code>a(n) = (q - p)/2</code>, where p is the largest prime <code>&lt; n</code> and q is the smallest prime <code>&gt; n</code>.
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
