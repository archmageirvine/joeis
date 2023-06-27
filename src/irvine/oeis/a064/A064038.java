package irvine.oeis.a064;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A064038 Numerator of average number of swaps needed to bubble sort a string of n distinct letters.
 * @author Sean A. Irvine
 */
public class A064038 extends LinearRecurrence {

  /** Construct the sequence. */
  public A064038() {
    super(1, new long[] {1, -3, 6, -10, 12, -12, 10, -6, 3}, new long[] {0, 1, 3, 3, 5, 15, 21, 14, 18});
  }
}
