package irvine.oeis.a125;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A125083 a(n) = n^5-n^4-n^3-n^2-n-1.
 * @author Sean A. Irvine
 */
public class A125083 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125083() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {-1, -4, 1, 122, 683, 2344});
  }
}
