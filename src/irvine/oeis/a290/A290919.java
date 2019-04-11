package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290919 p-INVERT of the positive integers, where p(S) <code>= (1 -</code> S)^4.
 * @author Sean A. Irvine
 */
public class A290919 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290919() {
    super(new long[] {-1, 12, -58, 144, -195, 144, -58, 12}, new long[] {4, 18, 72, 271, 976, 3398, 11516, 38179});
  }
}
