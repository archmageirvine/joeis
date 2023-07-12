package irvine.oeis.a061;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A061373 "Natural" logarithm, defined inductively by a(1)=1, a(p) = 1 + a(p-1) if p is prime and a(n*m) = a(n) + a(m) if n, m&gt;1.
 * @author Sean A. Irvine
 */
public class A061373 extends MemorySequence {

  private final Fast mPrime = new Fast();

  {
    setOffset(1);
    add(null);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 1) {
      return Z.ONE;
    }
    if (mPrime.isPrime(n)) {
      return a(n - 1).add(1);
    }
    for (int k = 2; true; ++k) {
      if (n % k == 0) {
        return a(k).add(a(n / k));
      }
    }
  }
}

