package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101376 a(n) = n^2*(n^3 - n^2 + n + 1)/2.
 * @author Sean A. Irvine
 */
public class A101376 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101376() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 1, 14, 99, 424, 1325});
  }
}
