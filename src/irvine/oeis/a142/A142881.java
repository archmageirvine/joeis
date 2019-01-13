package irvine.oeis.a142;

import irvine.oeis.LinearRecurrence;

/**
 * A142881.
 * @author Sean A. Irvine
 */
public class A142881 extends LinearRecurrence {

  /** Construct the sequence. */
  public A142881() {
    super(new long[] {-1, 0, 0, 7, 0, 0}, new long[] {0, 1, 2, 3, 5, 13});
  }
}
