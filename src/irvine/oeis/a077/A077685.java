package irvine.oeis.a077;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a217.A217402;

/**
 * A077685 Squarefree numbers beginning with 9.
 * @author Sean A. Irvine
 */
public class A077685 extends FilterSequence {

  /** Construct the sequence. */
  public A077685() {
    super(1, new A217402(), Predicates.SQUARE_FREE::is);
  }
}
