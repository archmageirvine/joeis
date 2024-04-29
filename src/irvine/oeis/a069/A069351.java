package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A069351 Primes having no representation of the form n + A001222(n), complement of A069348.
 * @author Sean A. Irvine
 */
public class A069351 extends FilterSequence {

  /** Construct the sequence. */
  public A069351() {
    super(1, new A000040(), p -> {
      for (long k = 1; k <= p.bitLength() + 1; ++k) {
        if (Functions.BIG_OMEGA.l(p.subtract(k)) == k) {
          return false;
        }
      }
      return true;
    });
  }
}
