package irvine.oeis.a115;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A115271 Partial sums of floor((n+4)/4)^2.
 * @author Sean A. Irvine
 */
public class A115271 extends LinearRecurrence {

  /** Construct the sequence. */
  public A115271() {
    super(new long[] {-1, 2, -1, 0, 2, -4, 2, 0, -1, 2}, new long[] {1, 2, 3, 4, 8, 12, 16, 20, 29, 38});
  }
}
