package irvine.oeis.a087;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;

/**
 * A005349 Niven (or Harshad, or harshad) numbers: numbers that are divisible by the sum of their digits.
 * @author Sean A. Irvine
 */
public class A087141 extends FilterSequence {

  /** Construct the sequence. */
  public A087141() {
    super(1, new A087140(), k -> Predicates.HARSHAD.is(k));
  }
}
