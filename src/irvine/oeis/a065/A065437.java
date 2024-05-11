package irvine.oeis.a065;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A065437 Smallest base relative to which the n-th prime is palindromic.
 * @author Sean A. Irvine
 */
public class A065437 extends A000040 {

  @Override
  public Z next() {
    final long p = super.next().longValueExact();
    int base = 1;
    while (true) {
      final int base1 = ++base;
      if (Predicates.PALINDROME.is(base1, p)) {
        return Z.valueOf(base);
      }
    }
  }
}
