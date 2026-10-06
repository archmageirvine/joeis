package irvine.oeis.a086;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a023.A023201;

/**
 * A086776 Smaller member of a prime pair (p, p+6) with a square sum.
 * @author Sean A. Irvine
 */
public class A086776 extends FilterSequence {

  /** Construct the sequence. */
  public A086776() {
    super(1, new A023201(), p -> Predicates.SQUARE.is(p.multiply2().add(6)));
  }
}

