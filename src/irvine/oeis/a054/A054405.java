package irvine.oeis.a054;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A054405 Row sums of array T as in A055215.
 * @author Sean A. Irvine
 */
public class A054405 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054405() {
    super(new long[] {-1, 0, 1, 1}, new long[] {1, 2, 3, 5});
  }
}
