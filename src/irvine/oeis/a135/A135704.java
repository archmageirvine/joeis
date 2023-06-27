package irvine.oeis.a135;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A135704 a(n) = 7*n^2 + 4*n + 1.
 * @author Sean A. Irvine
 */
public class A135704 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135704() {
    super(-1, new long[] {1, -3, 3}, new long[] {4, 1, 12});
  }
}
