package irvine.oeis.a190;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A190576 a(n) = n^2 + 5*n - 5.
 * @author Sean A. Irvine
 */
public class A190576 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190576() {
    super(1, new long[] {1, -3, 3}, new long[] {1, 9, 19});
  }
}
