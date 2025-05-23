package irvine.oeis.a274;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A274579 Values of k such that 2*k+1 and 5*k+1 are both triangular numbers.
 * @author Sean A. Irvine
 */
public class A274579 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274579() {
    super(1, new long[] {1, -1, 0, 0, -1442, 1442, 0, 0, 1}, new long[] {0, 1, 7, 27, 540, 2002, 10660, 39501, 779247});
  }
}
