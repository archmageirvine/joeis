package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A069346 Primes of the form n - Omega(n), where Omega(n) is the number of prime factors of n, A001222(n).
 * @author Sean A. Irvine
 */
public class A069346 extends FilterSequence {

  /** Construct the sequence. */
  public A069346() {
    super(1, new A000040(), p -> {
      for (long k = 1; k <= p.bitLength() + 1; ++k) {
        if (Functions.BIG_OMEGA.l(p.add(k)) == k) {
          return true;
        }
      }
      return false;
    });
  }
}
