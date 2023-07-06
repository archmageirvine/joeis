package irvine.oeis.a048;

import irvine.oeis.PrependSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A048809 Number of rooted trees with n nodes with every leaf at height 4.
 * @author Georg Fischer
 */
public class A048809 extends EulerTransform {

  /** Construct the sequence. */
  public A048809() {
    super(new PrependSequence(new A048808(), 0, 0, 0));
    skip(3);
    setOffset(5);
  }
}
