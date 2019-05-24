package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a008.A008578;

/**
 * A022837 <code>a(n) = c(1)p(0) +</code> ... <code>+ c(n)p(n-1)</code>, where <code>c(i) = 1</code> if <code>a(i-1) &lt; p(i-1)</code> and <code>c(i) = -1</code> if <code>a(i-1) &gt;= p(i-1) (p(0)=1, p(i)=primes)</code>.
 * @author Sean A. Irvine
 */
public class A022837 extends MemorySequence {

  {
    add(Z.ZERO);
  }

  @Override
  protected Z computeNext() {
    Z sum = Z.ZERO;
    final Sequence primes = new A008578();
    for (final Z a : this) {
      final Z p = primes.next();
      sum = sum.signedAdd(a.compareTo(p) < 0, p);
    }
    return sum;
  }
}
