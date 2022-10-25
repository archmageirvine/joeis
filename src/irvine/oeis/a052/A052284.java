package irvine.oeis.a052;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A052284 Number of compositions of n into nonprime numbers.
 * @author Sean A. Irvine
 */
public class A052284 extends MemorySequence {

  // After Alois P. Heinz

  private final Fast mPrime = new Fast();

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int j = 1; j <= n; ++j) {
      if (!mPrime.isPrime(j)) {
        sum = sum.add(a(n - j));
      }
    }
    return sum;
  }
}
