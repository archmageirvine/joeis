package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267807.
 * @author Sean A. Irvine
 */
public class A267807 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267807() {
    super(new long[] {-1, 0, 1, 0, 0, 0, 0, 0, 1, 0}, new long[] {1, 1, 2, 3, 2, 5, 4, 6, 4, 7});
  }
}
