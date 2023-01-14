package irvine.oeis.a007;

import irvine.oeis.SkipSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A007714 Number of 5-level rooted trees with n leaves.
 * @author Sean A. Irvine
 */
public class A007714 extends EulerTransform {

  /** Construct the sequence. */
  public A007714() {
    super(0, new SkipSequence(new A007713(), 1), 1);
  }
}
