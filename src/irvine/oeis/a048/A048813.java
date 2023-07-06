package irvine.oeis.a048;

import irvine.oeis.PrependSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A048813 Number of rooted trees with n nodes with every leaf at height 8.
 * @author Georg Fischer
 */
public class A048813 extends EulerTransform {

  /** Construct the sequence. */
  public A048813() {
    super(new PrependSequence(new A048812(), 0, 0, 0, 0, 0, 0, 0));
    skip(7);
    setOffset(9);
  }
}
