package irvine.oeis.a007;

import irvine.oeis.transform.EulerTransformSequence;
import irvine.oeis.a001.A001970;

/**
 * A007713 Number of 4-level rooted trees with n leaves.
 * @author Sean A. Irvine
 */
public class A007713 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A007713() {
    super(new A001970(), 1);
  }
}
