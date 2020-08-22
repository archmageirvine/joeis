package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267522 a(n) = 4*(n + 1)*(n + 2)*(4*n + 3)/3.
 * @author Sean A. Irvine
 */
public class A267522 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267522() {
    super(new long[] {-1, 4, -6, 4}, new long[] {8, 56, 176, 400});
  }
}
