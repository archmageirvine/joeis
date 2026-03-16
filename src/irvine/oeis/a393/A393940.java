package irvine.oeis.a393;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterNumberSequence;

/**
 * A393940 Numbers m such that tau(m) is a perfect number (A000396).
 * @author Sean A. Irvine
 */
public class A393940 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A393940() {
    super(1, k -> Predicates.PERFECT.is(Functions.SIGMA0.z(k)));
  }
}
