package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077400 Triangular numbers that are 7 times triangular numbers.
 * @author Sean A. Irvine
 */
public class A077400 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077400() {
    super(new long[] {1, -1, -254, 254, 1}, new long[] {0, 21, 105, 5460, 26796});
  }
}
