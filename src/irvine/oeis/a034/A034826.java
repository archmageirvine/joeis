package irvine.oeis.a034;

import irvine.oeis.transform.EulerTransform;

/**
 * A034826 Number of n-node rooted trees of height at most 9.
 * @author Sean A. Irvine
 */
public class A034826 extends EulerTransform {

  /** Construct the sequence. */
  public A034826() {
    super(0, new A034825().skip(1), 1, 1);
  }
}

