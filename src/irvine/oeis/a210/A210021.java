package irvine.oeis.a210;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A210021 Number of binary words of length n containing no subword 11011.
 * @author Sean A. Irvine
 */
public class A210021 extends LinearRecurrence {

  /** Construct the sequence. */
  public A210021() {
    super(new long[] {1, 1, -1, 0, 2}, new long[] {1, 2, 4, 8, 16});
  }
}
