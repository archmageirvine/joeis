package irvine.oeis.a086;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a023.A023201;

/**
 * A400353.
 * @author Sean A. Irvine
 */
public class A086776 extends FilterSequence {

  /** Construct the sequence. */
  public A086776() {
    super(1, new A023201(), p -> Predicates.SQUARE.is(p.multiply2().add(6)));
  }
}

