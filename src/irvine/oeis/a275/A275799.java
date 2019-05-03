package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275799 Number of inequivalent <code>(modulo C_4</code> rotations) square <code>n X n</code> grids with squares coming in two colors and three squares have one of the colors.
 * @author Sean A. Irvine
 */
public class A275799 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275799() {
    super(new long[] {1, -4, 3, 8, -14, 0, 14, -8, -3, 4}, new long[] {1, 22, 140, 578, 1785, 4612, 10416, 21340, 40425, 72010});
  }
}
