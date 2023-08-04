package irvine.oeis.a217;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A217873 a(n) = 4*n*(n^2 + 2)/3.
 * @author Sean A. Irvine
 */
public class A217873 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217873() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 4, 16, 44});
  }
}
