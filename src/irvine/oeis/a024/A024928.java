package irvine.oeis.a024;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024928 a(n) = Sum_{k=1..n} floor( (n + p(k))/k ).
 * @author Sean A. Irvine
 */
public class A024928 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1, p = 2; k <= mN; ++k, p = mPrime.nextPrime(p)) {
      sum = sum.add((mN + p) / k);
    }
    return sum;
  }
}
