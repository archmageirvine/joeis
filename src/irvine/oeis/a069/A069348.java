package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A069348 Primes of the form k + Omega(k), where Omega(k) is the number of prime factors of k, A001222(k).
 * @author Sean A. Irvine
 */
public class A069348 extends FilterSequence {

  /** Construct the sequence. */
  public A069348() {
    super(1, new A000040(), p -> {
      for (long k = 1; k <= p.bitLength() + 1; ++k) {
        if (Functions.BIG_OMEGA.l(p.subtract(k)) == k) {
          return true;
        }
      }
      return false;
    });
  }
}
