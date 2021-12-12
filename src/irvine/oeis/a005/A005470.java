package irvine.oeis.a005;

import irvine.oeis.transform.EulerTransformSequence;
import irvine.oeis.a003.A003094;

/**
 * A005470 Number of unlabeled planar simple graphs with n nodes.
 * @author Sean A. Irvine
 */
public class A005470 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A005470() {
    super(new A003094(), 1);
  }
}
