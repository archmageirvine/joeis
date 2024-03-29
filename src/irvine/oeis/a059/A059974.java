package irvine.oeis.a059;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A059974 a(n)=a(p)+a(q) where p and q are the two primes less than n and closest to n; with a(1)=1, a(2)=1, a(3) = 1.
 * @author Sean A. Irvine
 */
public class A059974 extends MemorySequence {

  private final Fast mPrime = new Fast();
  {
    setOffset(1);
    add(null);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 3) {
      return Z.ONE;
    }
    final int p = (int) mPrime.prevPrime(n);
    return a(p).add(a((int) mPrime.prevPrime(p)));
  }
}
