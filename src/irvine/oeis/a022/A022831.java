package irvine.oeis.a022;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A022831 <code>a(n) = c(1)p(1) +</code> ... <code>+ c(n)p(n)</code>, where <code>c(i) = 1</code> if <code>a(i-1) &gt;= p(i)</code> and <code>c(i) = -1</code> if <code>a(i-1) &lt; p(i)</code>, for i <code>= 1,...,n (p(i) =</code> primes).
 * @author Sean A. Irvine
 */
public class A022831 extends MemorySequence {

  private final Fast mPrime = new Fast();
  {
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
