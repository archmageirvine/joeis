package irvine.oeis.a054;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A054418 Number of connected 3 X n binary matrices with rightmost column [1,1,1]', divided by 4.
 * @author Sean A. Irvine
 */
public class A054418 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054418() {
    super(1, new long[] {5, -3, 7}, new long[] {1, 8, 53});
  }
}
