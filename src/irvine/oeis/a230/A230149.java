package irvine.oeis.a230;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A230149 The number of multinomial coefficients over partitions with value equal to 5.
 * @author Sean A. Irvine
 */
public class A230149 extends LinearRecurrence {

  /** Construct the sequence. */
  public A230149() {
    super(1, new long[] {-1, 0, 0, 0, 1, 1, 0, 0, 0}, new long[] {0, 0, 0, 0, 0, 1, 1, 1, 2});
  }
}
