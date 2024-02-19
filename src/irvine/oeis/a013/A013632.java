package irvine.oeis.a013;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A013632 Difference between n and the next prime greater than n.
 * @author Sean A. Irvine
 */
public class A013632 extends AbstractSequence implements DirectSequence {

  private final Fast mPrime = new Fast();
  private int mN = -1;

  /** Construct the sequence. */
  public A013632() {
    super(0);
  }

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final int n) {
    return Z.valueOf(mPrime.nextPrime(n) - n);
  }

  @Override
  public Z a(final Z n) {
    return mPrime.nextPrime(n).subtract(n);
  }

}
