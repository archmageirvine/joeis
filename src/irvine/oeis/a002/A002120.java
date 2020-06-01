package irvine.oeis.a002;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A002120 <code>a(1) = 0, a(2) = -2;</code> for <code>n &gt; 2, a(n) + a(n-2) - a(n-3) - a(n-5) - ... - a(n-p) = (-1)^(n+1)*n</code> if n is prime, otherwise <code>= 0</code>, where p = largest prime <code>&lt; n</code>.
 * @author Sean A. Irvine
 */
public class A002120 extends MemorySequence {

  private final Fast mPrime = new Fast();

  {
    add(Z.ZERO);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 2) {
      return n == 1 ? Z.ZERO : Z.valueOf(-2);
    }
    Z s = (mPrime.isPrime(n) ? Z.valueOf((n & 1) == 0 ? -n : n) : Z.ZERO).subtract(get(n - 2));
    long p = 2;
    while ((p = mPrime.nextPrime(p)) < n) {
      final int pp = (int) p;
      s = s.add(get(n - pp));
    }
    return s;
  }
}
