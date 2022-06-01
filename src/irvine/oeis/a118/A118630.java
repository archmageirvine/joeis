package irvine.oeis.a118;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A118630 Nonnegative values x of solutions (x, y) to the Diophantine equation x^2+(x+2401)^2 = y^2.
 * @author Sean A. Irvine
 */
public class A118630 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118630() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, 0, 0, -6, 6, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {0, 539, 924, 1220, 1715, 2744, 3503, 4095, 5096, 7203, 9996, 12075, 13703, 16464, 22295, 26640, 30044, 35819, 48020});
  }
}
