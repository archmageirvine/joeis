package irvine.oeis.a061;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A061803 Sum of n-th row of triangle of 4th powers: 1; 1 16 1; 1 16 81 16 1; 1 16 81 256 81 16 1; ...
 * @author Sean A. Irvine
 */
public class A061803 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061803() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 18, 115, 452, 1333, 3254});
  }
}
