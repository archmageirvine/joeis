package irvine.oeis.a005;

import irvine.oeis.SkipSequence;
import irvine.oeis.a003.A003094;
import irvine.oeis.transform.EulerTransform;

/**
 * A005470 Number of unlabeled planar simple graphs with n nodes.
 * @author Sean A. Irvine
 */
public class A005470 extends EulerTransform {

  /** Construct the sequence. */
  public A005470() {
    super(0, new SkipSequence(new A003094(), 1), 1);
  }
}
