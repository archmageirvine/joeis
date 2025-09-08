package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002477;

/**
 * A080162 Wonderful Demlo numbers A002477 whose digit sums are squares.
 * @author Sean A. Irvine
 */
public class A080162 extends FilterSequence {

  /** Construct the sequence. */
  public A080162() {
    super(1, new A002477(), k -> Predicates.SQUARE.is(Functions.DIGIT_SUM.z(k)));
  }
}
