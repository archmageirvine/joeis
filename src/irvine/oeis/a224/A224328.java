package irvine.oeis.a224;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A224328 Number of idempotent n X n 0..3 matrices of rank n-1.
 * @author Sean A. Irvine
 */
public class A224328 extends LinearRecurrence {

  /** Construct the sequence. */
  public A224328() {
    super(new long[] {-16, 40, -33, 10}, new long[] {1, 14, 93, 508});
  }
}
