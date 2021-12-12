package irvine.oeis.a007;

import irvine.oeis.transform.EulerTransformSequence;

/**
 * A007714 Number of 5-level rooted trees with n leaves.
 * @author Sean A. Irvine
 */
public class A007714 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A007714() {
    super(new A007713(), 1);
  }
}
