package irvine.oeis.a066;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A066854 a(n) = Sum_{k=1..8} 2^(8-k) * c(16n+2k+1), where c(j) is 1 if j is composite, 0 if j is prime.
 * @author Sean A. Irvine
 */
public class A066854 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -16;

  @Override
  public Z next() {
    mN += 16;
    Z sum = Z.ZERO;
    for (int k = 1; k <= 8; ++k) {
      if (!mPrime.isPrime(mN + 2 * k + 1)) {
        sum = sum.add(1 << (8 - k));
      }
    }
    return sum;
  }
}
