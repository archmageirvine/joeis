package irvine.oeis.a269;

import irvine.oeis.LinearRecurrence;

/**
 * A269132 a(n) = n + floor(n*(2*n+1)/5).
 * @author Sean A. Irvine
 */
public class A269132 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269132() {
    super(new long[] {1, -2, 1, 0, 0, -1, 2}, new long[] {0, 1, 4, 7, 11, 16, 21});
  }
}
