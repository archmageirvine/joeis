package irvine.oeis.a048;
// manually, 2021-07-01

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A048813 Number of rooted trees with n nodes with every leaf at height 8.
 * @author Georg Fischer
 */
public class A048813 extends SkipSequence {

  /** Construct the sequence. */
  public A048813() {
    super(9, new EulerTransform(new PrependSequence(new A048812(), 0, 0, 0, 0, 0, 0, 0)), 7);
  }
}
