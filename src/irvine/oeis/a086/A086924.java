package irvine.oeis.a086;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A086924 Primes such that sum of the first and last digits is a square.
 * @author Sean A. Irvine
 */
public class A086924 extends FilterSequence {

  /** Construct the sequence. */
  public A086924() {
    super(1, new A000040(), p -> {
      final String s = p.toString();
      return Predicates.SQUARE.is(s.charAt(0) + s.charAt(s.length() - 1) - 2 * '0');
    });
  }
}
