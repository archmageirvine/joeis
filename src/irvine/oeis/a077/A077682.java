package irvine.oeis.a077;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a217.A217399;

/**
 * A077682 Squarefree numbers beginning with 6.
 * @author Sean A. Irvine
 */
public class A077682 extends FilterSequence {

  /** Construct the sequence. */
  public A077682() {
    super(1, new A217399(), Predicates.SQUARE_FREE::is);
  }
}
