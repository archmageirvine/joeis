package irvine.oeis.a048;

import irvine.oeis.PrependSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A048810 Number of rooted trees with n nodes with every leaf at height 5.
 * @author Georg Fischer
 */
public class A048810 extends EulerTransform {

  /** Construct the sequence. */
  public A048810() {
    super(new PrependSequence(new A048809(), 0, 0, 0, 0));
    skip(4);
    setOffset(6);
  }
}
