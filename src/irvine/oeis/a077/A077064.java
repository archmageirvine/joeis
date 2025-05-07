package irvine.oeis.a077;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a006.A006093;

/**
 * A077064 Squarefree numbers of form prime - 1.
 * @author Sean A. Irvine
 */
public class A077064 extends FilterSequence {

  /** Construct the sequence. */
  public A077064() {
    super(1, new A006093(), Predicates.SQUARE_FREE::is);
  }
}
