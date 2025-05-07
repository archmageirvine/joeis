package irvine.oeis.a077;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a008.A008864;

/**
 * A077067 Squarefree numbers of the form prime + 1.
 * @author Sean A. Irvine
 */
public class A077067 extends FilterSequence {

  /** Construct the sequence. */
  public A077067() {
    super(1, new A008864(), Predicates.SQUARE_FREE::is);
  }
}
