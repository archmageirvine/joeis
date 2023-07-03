package irvine.oeis.a048;
// manually, 2021-07-01

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a002.A002865;
import irvine.oeis.transform.EulerTransform;

/**
 * A048808 Number of rooted trees with n nodes with every leaf at height 3.
 * @author Georg Fischer
 */
public class A048808 extends SkipSequence {

  /** Construct the sequence. */
  public A048808() {
    super(4, new EulerTransform(new PrependSequence(new SkipSequence(new A002865(), 1), 0L)), 2);
  }
}
