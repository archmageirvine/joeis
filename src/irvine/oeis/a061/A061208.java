package irvine.oeis.a061;

import irvine.oeis.a000.A000217;
import irvine.oeis.closure.DistinctAdditiveClosureSequence;

/**
 * A061208 Numbers which can be expressed as sum of distinct triangular numbers (A000217).
 * @author Sean A. Irvine
 */
public class A061208 extends DistinctAdditiveClosureSequence {

  /** Construct the sequence. */
  public A061208() {
    super(new A000217());
    next();
  }
}
