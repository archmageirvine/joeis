package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110665.
 * @author Sean A. Irvine
 */
public class A110665 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110665() {
    super(new long[] {-1, 2, -3, 2}, new long[] {0, 1, 0, -3});
  }
}
