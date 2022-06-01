package irvine.oeis.a218;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A218986 Power floor sequence of 2+sqrt(7).
 * @author Sean A. Irvine
 */
public class A218986 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218986() {
    super(new long[] {-3, -1, 5}, new long[] {4, 18, 83});
  }
}
