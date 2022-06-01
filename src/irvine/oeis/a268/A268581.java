package irvine.oeis.a268;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A268581 a(n) = 2*n^2 + 8*n + 5.
 * @author Sean A. Irvine
 */
public class A268581 extends LinearRecurrence {

  /** Construct the sequence. */
  public A268581() {
    super(new long[] {1, -3, 3}, new long[] {5, 15, 29});
  }
}
