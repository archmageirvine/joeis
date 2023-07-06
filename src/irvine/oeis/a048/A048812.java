package irvine.oeis.a048;

import irvine.oeis.PrependSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A048812 Number of rooted trees with n nodes with every leaf at height 7.
 * @author Georg Fischer
 */
public class A048812 extends EulerTransform {

  /** Construct the sequence. */
  public A048812() {
    super(new PrependSequence(new A048811(), 0, 0, 0, 0, 0, 0));
    skip(6);
    setOffset(8);
  }
}
