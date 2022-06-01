package irvine.oeis.a008;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A008501 7-dimensional centered tetrahedral numbers.
 * @author Sean A. Irvine
 */
public class A008501 extends LinearRecurrence {

  /** Construct the sequence. */
  public A008501() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 9, 45, 165, 495, 1287, 3003, 6435});
  }
}

