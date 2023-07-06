package irvine.oeis.a048;

import irvine.oeis.PrependSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A048815 Number of rooted trees with n nodes with every leaf at height 10.
 * @author Georg Fischer
 */
public class A048815 extends EulerTransform {

  /** Construct the sequence. */
  public A048815() {
    super(new PrependSequence(new A048814(), 0, 0, 0, 0, 0, 0, 0, 0, 0));
    skip(9);
    setOffset(11);
  }
}
