package irvine.oeis.a048;
// manually, 2021-07-01

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;

/**
 * A048815 Number of rooted trees with n nodes with every leaf at height 10.
 * @author Georg Fischer
 */
public class A048815 extends SkipSequence {

  /** Construct the sequence. */
  public A048815() {
    super(new EulerTransform(new PrependSequence(new A048814(), 0, 0, 0, 0, 0, 0, 0, 0, 0)), 9);
  }
}
