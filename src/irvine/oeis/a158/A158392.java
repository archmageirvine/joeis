package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158392 a(n) = 676*n^2 - 2*n.
 * @author Sean A. Irvine
 */
public class A158392 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158392() {
    super(1, new long[] {1, -3, 3}, new long[] {674, 2700, 6078});
  }
}
