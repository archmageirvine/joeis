package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a008.A008578;
import irvine.oeis.memory.MemorySequence;

/**
 * A022837 a(n) = c(0)*p(0) + ... + c(n)*p(n), where c(i) = 1 if a(i-1) &lt; p(i) and c(i) = -1 if a(i-1) &gt;= p(i) (p(0) = 1, p(i) = prime(i)).
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
