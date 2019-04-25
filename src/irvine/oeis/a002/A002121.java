package irvine.oeis.a002;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A002121 <code>a(0) = 1, a(1) = 0, a(2) = -1</code>; for <code>n &gt;= 3, a(n) = - a(n-2) + Sum_{</code> primes p with <code>3 &lt;=</code> p <code>&lt;= n}</code> a(n-p).
 * @author Sean A. Irvine
 */
public class A002121 extends MemorySequence {

  private final Fast mPrime = new Fast();

  @Override
  protected Z computeNext() {
    final int n = size();
    switch (n) {
    case 0:
      return Z.ONE;
    case 1:
      return Z.ZERO;
    case 2:
      return Z.NEG_ONE;
    default:
      Z s = get(n - 2).negate();
      long p = 2;
      while ((p = mPrime.nextPrime(p)) <= n) {
        final int pp = (int) p;
        s = s.add(get(n - pp));
      }
      return s;
    }
  }
}
