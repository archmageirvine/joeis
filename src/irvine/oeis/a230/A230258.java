package irvine.oeis.a230;

import irvine.oeis.LinearRecurrence;

/**
 * A230258 The number of multinomial coefficients over partitions with value equal to 10.
 * @author Sean A. Irvine
 */
public class A230258 extends LinearRecurrence {

  /** Construct the sequence. */
  public A230258() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 3, 2, 3, 3, 2, 3, 4, 3, 5});
  }
}
