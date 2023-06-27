package irvine.oeis.a274;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A274588 Values of n such that 2*n-1 and 7*n-1 are both triangular numbers.
 * @author Sean A. Irvine
 */
public class A274588 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274588() {
    super(1, new long[] {1, -1, -898, 898, 1}, new long[] {1, 8, 638, 6931, 572671});
  }
}
