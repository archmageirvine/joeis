package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158462 a(n) = 36*n^2 - 6.
 * @author Sean A. Irvine
 */
public class A158462 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158462() {
    super(1, new long[] {1, -3, 3}, new long[] {30, 138, 318});
  }
}
