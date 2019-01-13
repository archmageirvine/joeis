package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173344.
 * @author Sean A. Irvine
 */
public class A173344 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173344() {
    super(new long[] {-1, -1, -2, 1}, new long[] {0, 1, 0, -2});
  }
}
