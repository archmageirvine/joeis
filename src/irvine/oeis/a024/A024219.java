package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024219.
 * @author Sean A. Irvine
 */
public class A024219 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024219() {
    super(new long[] {1, -3, 4, -4, 3}, new long[] {0, 3, 7, 12, 19});
  }
}
