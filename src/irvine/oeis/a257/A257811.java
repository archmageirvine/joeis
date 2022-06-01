package irvine.oeis.a257;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A257811 Circle of fifths cycle (clockwise).
 * @author Sean A. Irvine
 */
public class A257811 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257811() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 8, 3, 10, 5, 12, 7, 2, 9, 4, 11, 6});
  }
}
