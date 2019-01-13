package irvine.oeis.a003;

import irvine.oeis.ContinuedFractionSequence;
import irvine.oeis.a005.A005533;

/**
 * A003118.
 * @author Sean A. Irvine
 */
public class A003118 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A003118() {
    super(new A005533());
  }
}
