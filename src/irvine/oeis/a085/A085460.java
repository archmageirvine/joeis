package irvine.oeis.a085;

import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A085460 Primes p such that there is at least one k dividing (p-1)!-1 (p &lt;= k &lt;= 2p).
 * @author Sean A. Irvine
 */
public class A085460 extends FilterSequence {

  /** Construct the sequence. */
  public A085460() {
    super(1, new A000040(), pp -> {
      final long p = pp.longValueExact();
      for (long k = p; k <= 2 * p; ++k) {
        long f = 1;
        for (long j = 2; j < p && f != 0; ++j) {
          f *= j;
          f %= k;
        }
        if (f == 1) {
          return true;
        }
      }
      return false;
    });
  }
}
