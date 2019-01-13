package irvine.oeis.a002;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A002123.
 * @author Sean A. Irvine
 */
public class A002123 extends MemorySequence {

  private final Fast mPrime = new Fast();

  {
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
        s = s.add(get(n - pp));
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
