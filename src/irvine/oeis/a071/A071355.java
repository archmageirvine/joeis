package irvine.oeis.a071;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A071355 a(n) = 2*n^2 + 11*n + 12.
 * @author Sean A. Irvine
 */
public class A071355 extends LinearRecurrence {

  /** Construct the sequence. */
  public A071355() {
    super(new long[] {1, -3, 3}, new long[] {3, 12, 25});
  }
}
