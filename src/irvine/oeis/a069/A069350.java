package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A069350 Primes having no representation of the form n - A001222(n), complement of A069346.
 * @author Sean A. Irvine
 */
public class A069350 extends FilterSequence {

  /** Construct the sequence. */
  public A069350() {
    super(1, new A000040(), p -> {
      for (long k = 1; k <= p.bitLength() + 1; ++k) {
        if (Functions.BIG_OMEGA.l(p.add(k)) == k) {
          return false;
        }
      }
      return true;
    });
  }
}
