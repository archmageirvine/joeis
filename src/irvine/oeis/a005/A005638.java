package irvine.oeis.a005;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.a002.A002851;

/**
 * A005638 Number of unlabeled trivalent (or cubic) graphs with 2n nodes.
 * @author Sean A. Irvine
 */
public class A005638 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A005638() {
    super(new A002851(), 1);
  }
}
