package irvine.oeis.a077;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a217.A217401;

/**
 * A077684 Squarefree numbers beginning with 8.
 * @author Sean A. Irvine
 */
public class A077684 extends FilterSequence {

  /** Construct the sequence. */
  public A077684() {
    super(1, new A217401(), Predicates.SQUARE_FREE::is);
  }
}
