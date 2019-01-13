package irvine.oeis.a062;

import irvine.oeis.LinearRecurrence;

/**
 * A062317.
 * @author Sean A. Irvine
 */
public class A062317 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062317() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 2, 10, 13, 29});
  }
}
