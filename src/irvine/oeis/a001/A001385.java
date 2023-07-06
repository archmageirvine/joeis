package irvine.oeis.a001;

import irvine.oeis.transform.EulerTransform;

/**
 * A001385 Number of n-node trees of height at most 5.
 * @author Sean A. Irvine
 */
public class A001385 extends EulerTransform {

  /** Construct the sequence. */
  public A001385() {
    super(new A001384().skip(1), 1, 1);
  }
}
