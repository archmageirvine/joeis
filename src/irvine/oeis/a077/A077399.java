package irvine.oeis.a077;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A077399 Triangular numbers that are 1/7 of triangular numbers.
 * @author Sean A. Irvine
 */
public class A077399 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077399() {
    super(new long[] {1, -1, -254, 254, 1}, new long[] {0, 3, 15, 780, 3828});
  }
}
