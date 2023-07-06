package irvine.oeis.a001;

import irvine.oeis.transform.EulerTransform;

/**
 * A001384 Number of n-node trees of height at most 4.
 * @author Sean A. Irvine
 */
public class A001384 extends EulerTransform {

  /** Construct the sequence. */
  public A001384() {
    super(new A001383().skip(1), 1, 1);
  }
}
