package irvine.oeis.a083;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A083074 n^3 - n^2 - n - 1.
 * @author Sean A. Irvine
 */
public class A083074 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083074() {
    super(new long[] {-1, 4, -6, 4}, new long[] {-1, -2, 1, 14});
  }
}
