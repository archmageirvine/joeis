package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000290;

/**
 * A074696.
 * @author Sean A. Irvine
 */
public class A074730 extends FilterSequence {

  /** Construct the sequence. */
  public A074730() {
    super(1, new A000290().skip(), k -> Predicates.SQUARE.is(Functions.ANTISIGMA1.z(k)));
  }
}
