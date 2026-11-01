package irvine.oeis.a087;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A087155 Primes having nontrivial palindromic representation in some (at least one) base.
 * @author Sean A. Irvine
 */
public class A087155 extends FilterSequence {

  /** Construct the sequence. */
  public A087155() {
    super(1, new A000040(), p -> {
      for (long b = p.longValueExact() - 2; b >= 2; --b) {
        if (Predicates.PALINDROME.is(b, p)) {
          return true;
        }
      }
      return false;
    });
  }
}
