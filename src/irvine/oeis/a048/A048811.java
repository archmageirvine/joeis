package irvine.oeis.a048;
// manually, 2021-07-01

import irvine.oeis.EulerTransform;
import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;

/**
 * A048811 Number of rooted trees with n nodes with every leaf at height 6.
 * @author Georg Fischer
 */
public class A048811 extends SkipSequence {

  /** Construct the sequence. */
  public A048811() {
    super(new EulerTransform(new PrependSequence(new A048810(), 0, 0, 0, 0, 0)), 5);
  }
}
