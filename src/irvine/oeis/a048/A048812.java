package irvine.oeis.a048;
// manually, 2021-07-01

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A048812 Number of rooted trees with n nodes with every leaf at height 7.
 * @author Georg Fischer
 */
public class A048812 extends SkipSequence {

  /** Construct the sequence. */
  public A048812() {
    super(8, new EulerTransform(new PrependSequence(new A048811(), 0, 0, 0, 0, 0, 0)), 6);
  }
}
