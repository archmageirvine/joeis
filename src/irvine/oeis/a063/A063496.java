package irvine.oeis.a063;

import irvine.oeis.LinearRecurrence;

/**
 * A063496 a(n) = (2*n - 1)*(8*n^2 - 8*n + 3)/3.
 * @author Sean A. Irvine
 */
public class A063496 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063496() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 19, 85, 231});
  }
}
