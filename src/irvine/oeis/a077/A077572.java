package irvine.oeis.a077;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a010.A010785;

/**
 * A077572 Nonsquarefree numbers obtained by repeating a single digit.
 * @author Sean A. Irvine
 */
public class A077572 extends FilterSequence {

  /** Construct the sequence. */
  public A077572() {
    super(1, new A010785().skip(), k -> !Predicates.SQUARE_FREE.is(k));
  }
}
