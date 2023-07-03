package irvine.oeis.a048;
// manually, 2021-07-01

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A048814 Number of rooted trees with n nodes with every leaf at height 9.
 * @author Georg Fischer
 */
public class A048814 extends SkipSequence {

  /** Construct the sequence. */
  public A048814() {
    super(10, new EulerTransform(new PrependSequence(new A048813(), 0, 0, 0, 0, 0, 0, 0, 0)), 8);
  }
}
