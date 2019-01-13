package irvine.oeis.a218;

import irvine.oeis.LinearRecurrence;

/**
 * A218329.
 * @author Sean A. Irvine
 */
public class A218329 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218329() {
    super(new long[] {-1, 1, 0, 3, -3, 0, -3, 3, 0, 1}, new long[] {10, 34, 80, 266, 420, 624, 1210, 1606, 2080, 3290});
  }
}
