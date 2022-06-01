package irvine.oeis.a174;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A174029 a(n) = 3*(3*n+1)*(5 - (-1)^n)/4.
 * @author Sean A. Irvine
 */
public class A174029 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174029() {
    super(new long[] {-1, 0, 2, 0}, new long[] {3, 18, 21, 45});
  }
}
