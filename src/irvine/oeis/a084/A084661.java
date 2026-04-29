package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterNumberSequence;

/**
 * A084661 Numbers k such that k + sum_of_digits(k) is a cube.
 * @author Sean A. Irvine
 */
public class A084661 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A084661() {
    super(1, k -> Predicates.CUBE.is(Functions.DIGIT_SUM.l(k) + k));
  }
}
