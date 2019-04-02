package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153237 a(n) = A000079(n) - A153130(n).
 * @author Sean A. Irvine
 */
public class A153237 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153237() {
    super(new long[] {-2, 3, -1, -2, 3}, new long[] {0, 0, 0, 0, 9});
  }
}
