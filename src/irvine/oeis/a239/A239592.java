package irvine.oeis.a239;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A239592 (n^4 - n^3 + 4*n^2 + 2)/2.
 * @author Sean A. Irvine
 */
public class A239592 extends LinearRecurrence {

  /** Construct the sequence. */
  public A239592() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 3, 13, 46, 129});
  }
}
