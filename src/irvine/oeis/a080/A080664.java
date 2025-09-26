package irvine.oeis.a080;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a000.A000108;

/**
 * A080664 Numbers n such that n-th Catalan number is squarefree.
 * @author Sean A. Irvine
 */
public class A080664 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A080664() {
    super(1, new A000108().skip(), Predicates.SQUARE_FREE::is);
  }
}
