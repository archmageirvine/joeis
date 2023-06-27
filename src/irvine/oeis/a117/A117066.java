package irvine.oeis.a117;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A117066 Partial sums of cupolar numbers (1/3)*(n+1)*(5*n^2+7*n+3) (A096000).
 * @author Sean A. Irvine
 */
public class A117066 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117066() {
    super(1, new long[] {1, -5, 10, -10, 5}, new long[] {1, 11, 48, 140, 325});
  }
}
