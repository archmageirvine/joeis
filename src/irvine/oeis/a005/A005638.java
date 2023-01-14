package irvine.oeis.a005;

import irvine.oeis.SkipSequence;
import irvine.oeis.a002.A002851;
import irvine.oeis.transform.EulerTransform;

/**
 * A005638 Number of unlabeled trivalent (or cubic) graphs with 2n nodes.
 * @author Sean A. Irvine
 */
public class A005638 extends EulerTransform {

  /** Construct the sequence. */
  public A005638() {
    super(0, new SkipSequence(new A002851(), 1), 1);
  }
}
