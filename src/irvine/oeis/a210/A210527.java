package irvine.oeis.a210;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A210527 a(n) = 9*n^2 + 39*n + 83.
 * @author Sean A. Irvine
 */
public class A210527 extends LinearRecurrence {

  /** Construct the sequence. */
  public A210527() {
    super(new long[] {1, -3, 3}, new long[] {83, 131, 197});
  }
}
