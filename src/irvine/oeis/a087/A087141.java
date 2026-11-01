package irvine.oeis.a087;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;

/**
 * A087141 Numbers divisible by the sum of their digits, but not by all their individual digits.
 * @author Sean A. Irvine
 */
public class A087141 extends FilterSequence {

  /** Construct the sequence. */
  public A087141() {
    super(1, new A087140(), k -> Predicates.HARSHAD.is(k));
  }
}
