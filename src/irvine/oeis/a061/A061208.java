package irvine.oeis.a061;

import irvine.oeis.DistinctAdditiveClosureSequence;
import irvine.oeis.a000.A000217;

/**
 * A061200.
 * @author Sean A. Irvine
 */
public class A061208 extends DistinctAdditiveClosureSequence {

  /** Construct the sequence. */
  public A061208() {
    super(new A000217());
    next();
  }
}
