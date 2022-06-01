package irvine.oeis.a244;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A244725 a(n) = 5*n^3.
 * @author Sean A. Irvine
 */
public class A244725 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244725() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 5, 40, 135});
  }
}
