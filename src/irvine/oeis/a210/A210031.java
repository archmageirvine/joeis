package irvine.oeis.a210;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A210031 Number of binary words of length n containing no subword 100001.
 * @author Sean A. Irvine
 */
public class A210031 extends LinearRecurrence {

  /** Construct the sequence. */
  public A210031() {
    super(new long[] {1, -1, 0, 0, 0, 2}, new long[] {1, 2, 4, 8, 16, 32});
  }
}
