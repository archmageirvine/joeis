package irvine.oeis.a004;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterNumberSequence;

/**
 * A004215 Numbers that are the sum of 4 but no fewer nonzero squares.
 * @author Sean A. Irvine
 */
public class A004215 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A004215() {
    super(1, 6, Predicates.SUM_OF_4_SQUARES::is);
  }
}
