package irvine.oeis.a033;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A033559 a(n) = (q - p)/2, where p is the largest prime &lt; n and q is the smallest prime &gt; n.
 * @author Sean A. Irvine
 */
public class A033559 extends AbstractSequence {

  /* Construct the sequence. */
  public A033559() {
    super(4);
  }

  private final Fast mPrime = new Fast();
  private long mN = 3;

  @Override
  public Z next() {
    return Z.valueOf((mPrime.nextPrime(++mN) - mPrime.prevPrime(mN)) / 2);
  }
}
