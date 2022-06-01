package irvine.oeis.a230;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A230167 The number of multinomial coefficients over partitions with value equal to 6.
 * @author Sean A. Irvine
 */
public class A230167 extends LinearRecurrence {

  /** Construct the sequence. */
  public A230167() {
    super(new long[] {1, 0, 0, 0, -1, -1, -1, 0, 0, 1, 1, 1, 0, 0, 0}, new long[] {0, 0, 0, 0, 0, 2, 2, 4, 4, 7, 7, 10, 10, 15, 14});
  }
}
