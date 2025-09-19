package irvine.oeis.a080;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a001.A001157;

/**
 * A080401 Numbers k such that the sum of the squares of the divisors of k (A001157(k)) is squarefree.
 * @author Sean A. Irvine
 */
public class A080401 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A080401() {
    super(1, new A001157(), Predicates.SQUARE_FREE::is);
  }
}
