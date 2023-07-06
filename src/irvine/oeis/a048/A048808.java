package irvine.oeis.a048;

import irvine.oeis.PrependSequence;
import irvine.oeis.a002.A002865;
import irvine.oeis.transform.EulerTransform;

/**
 * A048808 Number of rooted trees with n nodes with every leaf at height 3.
 * @author Georg Fischer
 */
public class A048808 extends EulerTransform {

  /** Construct the sequence. */
  public A048808() {
    super(new PrependSequence(new A002865().skip(1), 0L));
    skip(2);
    setOffset(4);
  }
}
