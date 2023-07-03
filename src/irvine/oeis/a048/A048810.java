package irvine.oeis.a048;
// manually, 2021-07-01

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A048810 Number of rooted trees with n nodes with every leaf at height 5.
 * @author Georg Fischer
 */
public class A048810 extends SkipSequence {

  /** Construct the sequence. */
  public A048810() {
    super(6, new EulerTransform(new PrependSequence(new A048809(), 0, 0, 0, 0)), 4);
  }
}
