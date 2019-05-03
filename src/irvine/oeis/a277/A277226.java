package irvine.oeis.a277;

import irvine.oeis.LinearRecurrence;

/**
 * A277226 Number of inequivalent <code>(modulo C_4 rotations)</code> square <code>n X n</code> grids with squares coming in two colors and four squares have one of the colors.
 * @author Sean A. Irvine
 */
public class A277226 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277226() {
    super(new long[] {1, -6, 12, -2, -27, 36, 0, -36, 27, 2, -12, 6}, new long[] {1, 34, 464, 3182, 14769, 53044, 158976, 416140, 980625, 2124310, 4295376, 8199674});
  }
}
