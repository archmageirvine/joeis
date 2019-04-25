package irvine.oeis.a279;

import irvine.oeis.LinearRecurrence;

/**
 * A279442 Number of ways to place 8 points on an n X n square grid so that no more than 2 points are on a vertical or horizontal straight line.
 * @author Sean A. Irvine
 */
public class A279442 extends LinearRecurrence {

  /** Construct the sequence. */
  public A279442() {
    super(new long[] {1, -17, 136, -680, 2380, -6188, 12376, -19448, 24310, -24310, 19448, -12376, 6188, -2380, 680, -136, 17}, new long[] {0, 0, 0, 90, 67950, 4531950, 109425330, 1460297160, 13112872920L, 88456195800L, 480149029800L, 2196080372970L, 8743233946590L, 31033043111070L, 99992483914050L, 296626638016800L, 819218054279520L});
  }
}
