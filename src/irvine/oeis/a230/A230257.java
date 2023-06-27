package irvine.oeis.a230;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A230257 The number of multinomial coefficients over partitions with value equal to 9.
 * @author Sean A. Irvine
 */
public class A230257 extends LinearRecurrence {

  /** Construct the sequence. */
  public A230257() {
    super(1, new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2});
  }
}
