package irvine.oeis.a224;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A224335 Number of idempotent 4X4 0..n matrices of rank 3.
 * @author Sean A. Irvine
 */
public class A224335 extends LinearRecurrence {

  /** Construct the sequence. */
  public A224335() {
    super(1, new long[] {-1, 4, -6, 4}, new long[] {60, 212, 508, 996});
  }
}
