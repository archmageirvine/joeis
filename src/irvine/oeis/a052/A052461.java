package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052461.
 * @author Sean A. Irvine
 */
public class A052461 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052461() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {1, 177, 5111, 60962, 430729, 2158099, 8488095, 27903044, 79895265, 205033333});
  }
}
