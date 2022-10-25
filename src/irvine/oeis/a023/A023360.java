package irvine.oeis.a023;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A023360 Number of compositions of n into prime parts.
 * @author Sean A. Irvine
 */
public class A023360 extends MemorySequence {

  private final Fast mPrime = new Fast();

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int p = 2; p <= n; p = (int) mPrime.nextPrime(p)) {
      sum = sum.add(a(n - p));
    }
    return sum;
  }
}
