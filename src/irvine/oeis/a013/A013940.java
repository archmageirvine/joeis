package irvine.oeis.a013;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013940 <code>a(n) = Sum_{k=1..n} floor(n/prime(k)^2)</code>.
 * @author Sean A. Irvine
 */
public class A013940 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long p = 2; p * p <= mN; p = mPrime.nextPrime(p)) {
      sum = sum.add(mN / (p * p));
    }
    return sum;
  }
}
