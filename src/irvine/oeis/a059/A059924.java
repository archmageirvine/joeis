package irvine.oeis.a059;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A059924 Write the numbers from 1 to n^2 in a spiraling square; a(n) is the total of the sums of the two diagonals.
 * @author Sean A. Irvine
 */
public class A059924 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059924() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {0, 2, 10, 34, 80});
  }
}
