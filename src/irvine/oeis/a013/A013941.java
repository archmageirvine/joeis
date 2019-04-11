package irvine.oeis.a013;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013941 <code>a(n) =</code> Sum_{k <code>= 1..n}</code> floor(n/prime(k)^3).
 * @author Sean A. Irvine
 */
public class A013941 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long p = 2; p * p * p <= mN; p = mPrime.nextPrime(p)) {
      sum = sum.add(mN / (p * p * p));
    }
    return sum;
  }
}
