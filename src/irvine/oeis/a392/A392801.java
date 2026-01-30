package irvine.oeis.a392;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a173.A173143;

/**
 * A392801 Integers k such that the sum of the first k squarefree numbers is a square.
 * @author Sean A. Irvine
 */
public class A392801 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A392801() {
    super(1, 1, new A173143(), Predicates.SQUARE::is);
  }
}
