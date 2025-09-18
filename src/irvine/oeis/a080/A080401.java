package irvine.oeis.a080;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a001.A001157;

/**
 * A003022.
 * @author Sean A. Irvine
 */
public class A080401 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A080401() {
    super(1, new A001157(), Predicates.SQUARE_FREE::is);
  }
}
