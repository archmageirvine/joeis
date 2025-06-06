package irvine.oeis.a077;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a217.A217398;

/**
 * A077681 Squarefree numbers beginning with 5.
 * @author Sean A. Irvine
 */
public class A077681 extends FilterSequence {

  /** Construct the sequence. */
  public A077681() {
    super(1, new A217398(), Predicates.SQUARE_FREE::is);
  }
}
