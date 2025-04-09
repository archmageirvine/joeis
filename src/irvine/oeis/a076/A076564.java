package irvine.oeis.a076;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a000.A000045;

/**
 * A076564 List of numbers k such that the k-th Fibonacci number (A000045) does not contain the digit zero.
 * @author Sean A. Irvine
 */
public class A076564 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A076564() {
    super(1, 0, new A000045(), k -> !Predicates.DIGIT_CONTAINS_ZERO.is(k));
  }
}
