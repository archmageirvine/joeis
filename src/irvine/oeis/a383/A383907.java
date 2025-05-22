package irvine.oeis.a383;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A383907 Echo primes: primes p such that the greatest prime factor of p-1 is a suffix of p.
 * @author Sean A. Irvine
 */
public class A383907 extends FilterSequence {

  /** Construct the sequence. */
  public A383907() {
    super(1, new A000040(), k -> Predicates.ECHO.is(k));
  }
}
