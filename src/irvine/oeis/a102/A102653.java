package irvine.oeis.a102;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A102653 a(n) = 4 * floor(27*2^n/15).
 * @author Sean A. Irvine
 */
public class A102653 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102653() {
    super(new long[] {-2, 3, -3, 3}, new long[] {4, 12, 28, 56});
  }
}
