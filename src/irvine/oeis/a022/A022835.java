package irvine.oeis.a022;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A022835 a(n) = c(1)p(3) + ... + c(n)p(n+2), where c(i) = 1 if a(i-1) &lt; p(i+2) and c(i) = -1 if a(i-1) &gt;= p(i+2) (p(i) = primes).
 * @author Sean A. Irvine
 */
public class A022835 extends MemorySequence {

  private final Fast mPrime = new Fast();
  {
    add(Z.ZERO);
  }

  protected Z first() {
    return Z.THREE;
  }

  @Override
  protected Z computeNext() {
    Z sum = Z.ZERO;
    Z p = first();
    for (final Z a : this) {
      p = mPrime.nextPrime(p);
      sum = sum.signedAdd(a.compareTo(p) < 0, p);
    }
    return sum;
  }
}
