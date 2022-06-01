package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017273 a(n) = (10*n)^5.
 * @author Sean A. Irvine
 */
public class A017273 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017273() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 100000, 3200000, 24300000, 102400000, 312500000});
  }
}
