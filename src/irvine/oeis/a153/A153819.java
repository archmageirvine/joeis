package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153819.
 * @author Sean A. Irvine
 */
public class A153819 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153819() {
    super(new long[] {1, -4, 4}, new long[] {16, 34, 88});
  }
}
