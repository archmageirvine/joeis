package irvine.oeis.a269;

import irvine.oeis.LinearRecurrence;

/**
 * A269451 The first of 50 consecutive positive integers the sum of the squares of which is a square.
 * @author Sean A. Irvine
 */
public class A269451 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269451() {
    super(new long[] {1, -1, 0, 0, 0, 0, -6, 6, 0, 0, 0, 0, 1}, new long[] {7, 28, 44, 67, 87, 124, 168, 287, 379, 512, 628, 843, 1099});
  }
}
