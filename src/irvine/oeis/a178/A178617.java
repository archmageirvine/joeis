package irvine.oeis.a178;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A178617 a(n) = n^4 - (n+1)^3.
 * @author Sean A. Irvine
 */
public class A178617 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178617() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {-1, -7, -11, 17, 131});
  }
}
