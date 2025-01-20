package irvine.oeis.a074;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000217;

/**
 * A074315 Abundant triangular numbers.
 * @author Sean A. Irvine
 */
public class A074315 extends FilterSequence {

  /** Construct the sequence. */
  public A074315() {
    super(1, new A000217().skip(), Predicates.ABUNDANT::is);
  }
}
