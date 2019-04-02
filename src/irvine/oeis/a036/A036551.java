package irvine.oeis.a036;

import irvine.oeis.LinearRecurrence;

/**
 * A036551 a(n) = 2^(n-1)*(3^n-1) + 1.
 * @author Sean A. Irvine
 */
public class A036551 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036551() {
    super(new long[] {12, -20, 9}, new long[] {1, 3, 17});
  }
}
