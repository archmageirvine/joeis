package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037661.
 * @author Sean A. Irvine
 */
public class A037661 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037661() {
    super(new long[] {-5, 1, 0, 5}, new long[] {3, 16, 80, 403});
  }
}
