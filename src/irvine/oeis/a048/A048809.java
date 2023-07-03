package irvine.oeis.a048;
// manually, 2021-07-01

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A048809 Number of rooted trees with n nodes with every leaf at height 4.
 * @author Georg Fischer
 */
public class A048809 extends SkipSequence {

  /** Construct the sequence. */
  public A048809() {
    super(5, new EulerTransform(new PrependSequence(new A048808(), 0, 0, 0)), 3);
  }
}
