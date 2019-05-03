package irvine.oeis.a113;

import irvine.oeis.LinearRecurrence;

/**
 * A113449 Sum of the square root of n-th square triangular number and n-th Pell <code>(or lambda)</code> number <code>(A000129)</code>.
 * @author Sean A. Irvine
 */
public class A113449 extends LinearRecurrence {

  /** Construct the sequence. */
  public A113449() {
    super(new long[] {1, -4, -12, 8}, new long[] {2, 8, 40, 216});
  }
}
