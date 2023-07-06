package irvine.oeis.a034;

import irvine.oeis.transform.EulerTransform;

/**
 * A034825 Number of n-node rooted trees of height at most 8.
 * @author Sean A. Irvine
 */
public class A034825 extends EulerTransform {

  /** Construct the sequence. */
  public A034825() {
    super(new A034824().skip(1), 1, 1);
  }
}
