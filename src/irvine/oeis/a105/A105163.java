package irvine.oeis.a105;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A105163 a(n) = (n^3 - 7*n + 12)/6.
 * @author Sean A. Irvine
 */
public class A105163 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105163() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 1, 3, 8});
  }
}
