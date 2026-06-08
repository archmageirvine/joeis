package irvine.oeis.a393;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a246.A246655;

/**
 * A393860 allocated for Roger Salmer\u00f3n Vit\u00f3.
 * @author Sean A. Irvine
 */
public class A393860 extends FilterSequence {

  /** Construct the sequence. */
  public A393860() {
    super(1, new A246655(), q -> Predicates.SQUARE_FREE.is(q.subtract(1)));
  }
}
