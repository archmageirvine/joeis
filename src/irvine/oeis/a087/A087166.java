package irvine.oeis.a087;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A087166 Primes which are palindromes in 3 or more bases.
 * @author Sean A. Irvine
 */
public class A087166 extends FilterSequence {

  /** Construct the sequence. */
  public A087166() {
    super(1, new A000040(), p -> {
      int cnt = 0;
      for (long b = p.longValueExact() - 1; b >= 2; --b) {
        if (Predicates.PALINDROME.is(b, p) && ++cnt >= 3) {
          return true;
        }
      }
      return false;
    });
  }
}
