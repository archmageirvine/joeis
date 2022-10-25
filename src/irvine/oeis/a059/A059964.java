package irvine.oeis.a059;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A059964 a(1) = 1, a(2) = 1, a(n) = a(n-p) + a((n+1)-p), n &gt; 2, where p is the largest prime less than n.
 * @author Sean A. Irvine
 */
public class A059964 extends MemorySequence {

  private final Fast mPrime = new Fast();
  {
    setOffset(1);
    add(null);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 2) {
      return Z.ONE;
    }
    final int p = (int) mPrime.prevPrime(n);
    return a(n - p).add(a(n + 1 - p));
  }
}
