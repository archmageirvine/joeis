package irvine.oeis.a203;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A203552 a(n) = n*(5*n^2 - 3*n + 4) / 6.
 * @author Sean A. Irvine
 */
public class A203552 extends LinearRecurrence {

  /** Construct the sequence. */
  public A203552() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1, 6, 20});
  }
}
