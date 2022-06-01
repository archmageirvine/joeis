package irvine.oeis.a135;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A135712 a(n) = (4*n^3 + 11*n^2 + 9*n + 2)/2.
 * @author Sean A. Irvine
 */
public class A135712 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135712() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 13, 48, 118});
  }
}
