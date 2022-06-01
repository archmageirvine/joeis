package irvine.oeis.a180;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A180223 a(n) = (11*n^2 - 7*n)/2.
 * @author Sean A. Irvine
 */
public class A180223 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180223() {
    super(new long[] {1, -3, 3}, new long[] {0, 2, 15});
  }
}
