package irvine.oeis.a033;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A033597 (nextprime(n)+prevprime(n))/2.
 * @author Sean A. Irvine
 */
public class A033597 extends AbstractSequence {

  /* Construct the sequence. */
  public A033597() {
    super(4);
  }

  private final Fast mPrime = new Fast();
  private long mN = 3;

  @Override
  public Z next() {
    return Z.valueOf((mPrime.nextPrime(++mN) + mPrime.prevPrime(mN)) / 2);
  }
}
