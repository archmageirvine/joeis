package irvine.oeis.a022;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A022831 a(n) = c(1)p(1) + ... + c(n)p(n), where c(i) = 1 if a(i-1) &lt;= p(i) and c(i) = -1 if a(i-1) &gt; p(i), for i = 1,...,n (p(i) = primes).
 * @author Sean A. Irvine
 */
public class A022831 extends MemorySequence {

  private final Fast mPrime = new Fast();
  {
    setOffset(1);
    add(Z.ZERO);
  }

  protected Z first() {
    return Z.ONE;
  }

  @Override
  protected Z computeNext() {
    Z sum = Z.ZERO;
    Z p = first();
    for (final Z a : this) {
      p = mPrime.nextPrime(p);
      sum = sum.signedAdd(a.compareTo(p) <= 0, p);
    }
    return sum;
  }
}
