package irvine.oeis.a230;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A230198 The number of multinomial coefficients over partitions with value equal to 8.
 * @author Sean A. Irvine
 */
public class A230198 extends LinearRecurrence {

  /** Construct the sequence. */
  public A230198() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0}, new long[] {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2});
  }
}
