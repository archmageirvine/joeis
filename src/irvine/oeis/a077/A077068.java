package irvine.oeis.a077;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a008.A008864;

/**
 * A077068 Semiprimes of the form prime + 1.
 * @author Sean A. Irvine
 */
public class A077068 extends FilterSequence {

  /** Construct the sequence. */
  public A077068() {
    super(1, new A008864(), Predicates.SEMIPRIME::is);
  }
}
