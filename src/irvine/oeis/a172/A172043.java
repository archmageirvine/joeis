package irvine.oeis.a172;

import irvine.oeis.LinearRecurrence;

/**
 * A172043 a(n) = 5*n^2 - n + 1.
 * @author Sean A. Irvine
 */
public class A172043 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172043() {
    super(new long[] {1, -3, 3}, new long[] {1, 5, 19});
  }
}
