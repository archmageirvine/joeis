package irvine.oeis.a077;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a010.A010785;

/**
 * A077571 Squarefree numbers obtained by repeating a single digit.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A077571 extends FilterSequence {

  /** Construct the sequence. */
  public A077571() {
    super(1, new A010785(), Predicates.SQUARE_FREE::is);
  }
}
