package irvine.oeis.a033;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033597 (nextprime(n)+prevprime(n))/2.
 * @author Sean A. Irvine
 */
public class A033597 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 3;

  @Override
  public Z next() {
    return Z.valueOf((mPrime.nextPrime(++mN) + mPrime.prevPrime(mN)) / 2);
  }
}
