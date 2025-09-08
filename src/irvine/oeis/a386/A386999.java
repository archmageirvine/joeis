package irvine.oeis.a386;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000217;

/**
 * A386999 allocated for Omar E. Pol.
 * @author Sean A. Irvine
 */
public class A386999 extends FilterSequence {

  /** Construct the sequence. */
  public A386999() {
    super(1, new A000217().skip(), Predicates.TWO_DENSE::is);
  }
}

