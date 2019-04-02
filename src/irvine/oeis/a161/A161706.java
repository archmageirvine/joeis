package irvine.oeis.a161;

import irvine.oeis.LinearRecurrence;

/**
 * A161706 a(n) = (-11*n^5 + 145*n^4 - 635*n^3 + 1115*n^2 - 494*n + 120)/120.
 * @author Sean A. Irvine
 */
public class A161706 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161706() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 2, 4, 5, 10, 20});
  }
}
