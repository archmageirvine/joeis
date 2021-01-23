package irvine.oeis.a245;

import irvine.oeis.LinearRecurrence;

/**
 * A245032 a(n) = 27*(n - 6)^2 + 4*(n - 6)^3 = ((n - 6)^2)*(4*n + 3).
 * @author Sean A. Irvine
 */
public class A245032 extends LinearRecurrence {

  /** Construct the sequence. */
  public A245032() {
    super(new long[] {-1, 4, -6, 4}, new long[] {108, 175, 176, 135});
  }
}
