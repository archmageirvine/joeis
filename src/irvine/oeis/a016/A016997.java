package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016997.
 * @author Sean A. Irvine
 */
public class A016997 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016997() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 32768, 759375, 5153632, 20511149, 60466176});
  }
}
