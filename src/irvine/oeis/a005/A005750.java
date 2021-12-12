package irvine.oeis.a005;

import irvine.oeis.transform.EulerTransformSequence;
import irvine.oeis.a000.A000151;

/**
 * A005750 Number of planted matched trees with n nodes.
 * @author Sean A. Irvine
 */
public class A005750 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A005750() {
    super(new A000151(), 0);
  }
}
