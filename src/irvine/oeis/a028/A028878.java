package irvine.oeis.a028;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A028878 a(n) = (n+3)^2 - 6.
 * @author Sean A. Irvine
 */
public class A028878 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028878() {
    super(new long[] {1, -3, 3}, new long[] {3, 10, 19});
  }
}
