package irvine.oeis.a318;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterNumberSequence;

/**
 * A318235 Ascending list of base-60 happy numbers written in base 10.
 * @author Sean A. Irvine
 */
public class A318235 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A318235() {
    super(1, k -> Predicates.HAPPY.is(60, k));
  }
}
