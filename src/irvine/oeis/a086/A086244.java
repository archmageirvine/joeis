package irvine.oeis.a086;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A086244 Primes such that a sum of any two adjacent digits is prime; first and last digits are considered adjacent.
 * @author Sean A. Irvine
 */
public class A086244 extends FilterSequence {

  /** Construct the sequence. */
  public A086244() {
    super(1, new A000040(), k -> {
      final String s = k.toString();
      if (!Predicates.PRIME.is(s.charAt(0) + s.charAt(s.length() - 1) - 2 * '0')) {
        return false;
      }
      for (int j = 1; j < s.length(); ++j) {
        if (!Predicates.PRIME.is(s.charAt(j - 1) + s.charAt(j) - 2 * '0')) {
          return false;
        }
      }
      return true;
    });
  }
}
