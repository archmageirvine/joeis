package irvine.oeis.a224;

import irvine.oeis.LinearRecurrence;

/**
 * A224335 Number of idempotent <code>4X4 0..n</code> matrices of rank 3.
 * @author Sean A. Irvine
 */
public class A224335 extends LinearRecurrence {

  /** Construct the sequence. */
  public A224335() {
    super(new long[] {-1, 4, -6, 4}, new long[] {60, 212, 508, 996});
  }
}
