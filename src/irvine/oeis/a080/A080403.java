package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;

/**
 * A003022.
 * @author Sean A. Irvine
 */
public class A080403 extends FilterSequence {

  /** Construct the sequence. */
  public A080403() {
    super(1, new A080401(), k -> Predicates.SQUARE_FREE.is(Functions.SIGMA1.z(k)));
  }
}
