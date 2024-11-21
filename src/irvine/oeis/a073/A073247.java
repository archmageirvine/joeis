package irvine.oeis.a073;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a005.A005117;

/**
 * A073171.
 * @author Sean A. Irvine
 */
public class A073247 extends FilterSequence {

  /** Construct the sequence. */
  public A073247() {
    super(1, new A005117(), k -> !Predicates.SQUARE_FREE.is(k.subtract(1)) && !Predicates.SQUARE_FREE.is(k.add(1)));
  }
}
