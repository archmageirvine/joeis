package irvine.oeis.a005;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.a000.A000055;

/**
 * A005195 Number of forests with n unlabeled nodes.
 * @author Sean A. Irvine
 */
public class A005195 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A005195() {
    super(new A000055(), 1);
  }
}
