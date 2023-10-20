package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;
import irvine.oeis.PartialSumSequence;
import irvine.oeis.a000.A000040;

/**
 * A007504 Sum of the first n primes.
 * @author Sean A. Irvine
 */
public class A007504 extends AbstractSequence implements DirectSequence {

  private final PartialSumSequence mSeq = new PartialSumSequence(new A000040());
  private Fast mPrime = null;
  private int mN = -1;

  /** Construct the sequence. */
  public A007504() {
    super(0);
  }

  @Override
  public Z next() {
    return (++mN == 0) ? Z.ZERO : mSeq.next();
  }

  @Override
  public Z a(final int n) {
    if (mPrime == null) {
      mPrime = new Fast();
    }
    Z sum = Z.ZERO;
    Z p = Z.ONE;
    for (int k = 1; k <= n; ++k) {
      p = mPrime.nextPrime(p);
      sum = sum.add(p);
    }
    return sum;
  }

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

}
