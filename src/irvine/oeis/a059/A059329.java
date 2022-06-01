package irvine.oeis.a059;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A059329 Number of 3 X 3 matrices, with elements from {0,...,n}, having the property that the middle element of each of the eight 3-element horizontal, vertical and diagonal lines equals the average of the two end elements.
 * @author Sean A. Irvine
 */
public class A059329 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059329() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {1, 2, 7, 12, 25, 38});
  }
}
