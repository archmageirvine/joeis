package irvine.oeis.a182;

import irvine.oeis.LinearRecurrence;

/**
 * A182568 a(n) = 2*floor(n/4)*(n - 2*(1 + floor(n/4))).
 * @author Sean A. Irvine
 */
public class A182568 extends LinearRecurrence {

  /** Construct the sequence. */
  public A182568() {
    super(new long[] {1, -2, 1, 0, -1, 2}, new long[] {0, 0, 0, 0, 0, 2});
  }
}
