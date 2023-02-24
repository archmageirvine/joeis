package irvine.oeis.a085;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A085284 a(n) = C(n+3,3)*n^3/4.
 * @author Sean A. Irvine
 */
public class A085284 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085284() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 1, 20, 135, 560, 1750, 4536});
  }
}
