package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A076503 Prime numbers whose squares have square digit-sums.
 * @author Sean A. Irvine
 */
public class A076503 extends FilterSequence {

  /** Construct the sequence. */
  public A076503() {
    super(1, new A000040(), p -> Predicates.SQUARE.is(Functions.DIGIT_SUM.l(p.square())));
  }
}
