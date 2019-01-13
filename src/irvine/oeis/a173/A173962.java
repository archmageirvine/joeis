package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173962.
 * @author Sean A. Irvine
 */
public class A173962 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173962() {
    super(new long[] {-1, 4, -6, 4}, new long[] {14, 76, 234, 536});
  }
}
