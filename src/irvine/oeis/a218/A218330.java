package irvine.oeis.a218;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A218330 Odd decagonal pyramidal numbers.
 * @author Sean A. Irvine
 */
public class A218330 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218330() {
    super(1, new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {1, 11, 175, 301, 1005, 1375, 3003});
  }
}
