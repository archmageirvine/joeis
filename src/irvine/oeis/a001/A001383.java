package irvine.oeis.a001;

import irvine.oeis.a000.A000041;
import irvine.oeis.transform.EulerTransform;

/**
 * A001383 Number of n-node rooted trees of height at most 3.
 * @author Sean A. Irvine
 */
public class A001383 extends EulerTransform {

  /** Construct the sequence. */
  public A001383() {
    super(new A000041(), 1, 1);
  }
}
