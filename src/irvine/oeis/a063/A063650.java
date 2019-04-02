package irvine.oeis.a063;

import irvine.oeis.LinearRecurrence;

/**
 * A063650 Number of ways to tile a 6 X n rectangle with 1 X 1 and 2 X 2 tiles.
 * @author Sean A. Irvine
 */
public class A063650 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063650() {
    super(new long[] {4, 1, -27, 1, 16, 2}, new long[] {1, 1, 13, 43, 269, 1213});
  }
}
