package irvine.oeis.a002;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A002123 a(1) = 0, a(2) = 0; for n &gt; 2, a(n) - a(n-3) - a(n-5) - ... - a(n-p) = n if n is prime, otherwise = 0, where p = largest prime &lt; n.
 * @author Sean A. Irvine
 */
public class A002123 extends MemorySequence {

  private final Fast mPrime = new Fast();

  {
    setOffset(1);
    add(Z.ZERO);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    switch (n) {
    case 1:
    case 2:
      return Z.ZERO;
    default:
      Z s = mPrime.isPrime(n) ? Z.valueOf(n) : Z.ZERO;
      long p = 2;
      while ((p = mPrime.nextPrime(p)) <= n) {
        final int pp = (int) p;
        s = s.add(a(n - pp));
      }
      return s;
    }
  }

  @Override
  public Z next() {
    final Z t = super.next();
    return (size() & 1) == 0 ? t : t.negate();
  }
}
