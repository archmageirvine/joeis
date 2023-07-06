package irvine.oeis.a007;

import irvine.oeis.a001.A001970;
import irvine.oeis.transform.EulerTransform;

/**
 * A007713 Number of 4-level rooted trees with n leaves.
 * @author Sean A. Irvine
 */
public class A007713 extends EulerTransform {

  /** Construct the sequence. */
  public A007713() {
    super(0, new A001970().skip(1), 1);
  }
}
