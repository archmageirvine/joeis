package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017561 (12n+3)^5.
 * @author Sean A. Irvine
 */
public class A017561 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017561() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {243, 759375, 14348907, 90224199, 345025251, 992436543});
  }
}
