package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157797 a(n) = 8984250*n - 1996170.
 * @author Sean A. Irvine
 */
public class A157797 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157797() {
    super(1, new long[] {-1, 2}, new long[] {6988080, 15972330});
  }
}
