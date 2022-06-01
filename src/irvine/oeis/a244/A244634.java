package irvine.oeis.a244;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A244634 27*n^2.
 * @author Sean A. Irvine
 */
public class A244634 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244634() {
    super(new long[] {1, -3, 3}, new long[] {0, 27, 108});
  }
}
