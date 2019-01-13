package irvine.oeis.a232;

import irvine.oeis.LinearRecurrence;

/**
 * A232492.
 * @author Sean A. Irvine
 */
public class A232492 extends LinearRecurrence {

  /** Construct the sequence. */
  public A232492() {
    super(new long[] {32, -48, 8, 4, 12, -2, -10, 6}, new long[] {0, 1, 1, 5, 14, 42, 112, 304});
  }
}
