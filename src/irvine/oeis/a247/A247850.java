package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247850 The 5th Hermite Polynomial evaluated at n: H_5(n) = 32*n^5-160*n^3+120*n.
 * @author Sean A. Irvine
 */
public class A247850 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247850() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, -8, -16, 3816, 23008, 80600});
  }
}
