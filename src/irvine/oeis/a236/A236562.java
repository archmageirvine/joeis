package irvine.oeis.a236;

import irvine.oeis.ComplementSequence;
import irvine.oeis.a045.A045765;

/**
 * A236562 Numbers n such that A049820(x) = n has a solution.
 * @author Sean A. Irvine
 */
public class A236562 extends ComplementSequence {

  /** Construct the sequence. */
  public A236562() {
    super(new A045765());
  }
}
