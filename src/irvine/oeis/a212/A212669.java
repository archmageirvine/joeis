package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212669 a(n) = 2/15 * (32*n^5 + 80*n^4 + 40*n^3 - 20*n^2 + 3*n).
 * @author Sean A. Irvine
 */
public class A212669 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212669() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {18, 340, 2022, 7400, 20602, 48060});
  }
}
