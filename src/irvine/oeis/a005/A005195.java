package irvine.oeis.a005;

import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000055;
import irvine.oeis.transform.EulerTransform;

/**
 * A005195 Number of forests with n unlabeled nodes.
 * @author Sean A. Irvine
 */
public class A005195 extends EulerTransform {

  /** Construct the sequence. */
  public A005195() {
    super(new SkipSequence(new A000055(), 1), 1);
  }
}
