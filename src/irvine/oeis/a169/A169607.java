package irvine.oeis.a169;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A169607 a(n) = 7*A000330(n).
 * @author Sean A. Irvine
 */
public class A169607 extends LinearRecurrence {

  /** Construct the sequence. */
  public A169607() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 7, 35, 98});
  }
}
