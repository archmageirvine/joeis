package irvine.oeis.a269;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A269449 The first of 33 consecutive positive integers the sum of the squares of which is a square.
 * @author Sean A. Irvine
 */
public class A269449 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269449() {
    super(1, new long[] {1, -1, 0, 0, 0, 0, -46, 46, 0, 0, 0, 0, 1}, new long[] {7, 27, 60, 181, 227, 612, 1085, 1985, 3492, 9047, 11161, 28860, 50607});
  }
}
