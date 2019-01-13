package irvine.oeis.a076;

import irvine.oeis.LinearRecurrence;

/**
 * A076758.
 * @author Sean A. Irvine
 */
public class A076758 extends LinearRecurrence {

  /** Construct the sequence. */
  public A076758() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 9, 98, 516, 1870, 5369, 13132});
  }
}
