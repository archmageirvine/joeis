package irvine.oeis.a176;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A176712 a(n) = 16*n^4 + 256*n^3 + 1160*n^2 + 1088*n + 285.
 * @author Sean A. Irvine
 */
public class A176712 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176712() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {285, 2805, 9405, 22197, 43677});
  }
}
