package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158482 a(n) = 14*n^2 + 1.
 * @author Sean A. Irvine
 */
public class A158482 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158482() {
    super(new long[] {1, -3, 3}, new long[] {15, 57, 127});
  }
}
