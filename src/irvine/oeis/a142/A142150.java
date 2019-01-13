package irvine.oeis.a142;

import irvine.oeis.LinearRecurrence;

/**
 * A142150.
 * @author Sean A. Irvine
 */
public class A142150 extends LinearRecurrence {

  /** Construct the sequence. */
  public A142150() {
    super(new long[] {-1, 0, 2, 0}, new long[] {0, 0, 1, 0});
  }
}
