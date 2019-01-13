package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173202.
 * @author Sean A. Irvine
 */
public class A173202 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173202() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 5, 58, 207});
  }
}
