package irvine.oeis.a077;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a007.A007088;

/**
 * A077763.
 * @author Sean A. Irvine
 */
public class A077813 extends FilterSequence {

  /** Construct the sequence. */
  public A077813() {
    super(1, new A007088(), Predicates.SQUARE_FREE::is);
  }
}

