package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022970 14-n.
 * @author Sean A. Irvine
 */
public class A022970 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022970() {
    super(new long[] {-1, 2}, new long[] {14, 13});
  }
}
