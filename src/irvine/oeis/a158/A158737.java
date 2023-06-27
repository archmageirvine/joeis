package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158737 a(n) = 1296*n^2 - 36.
 * @author Sean A. Irvine
 */
public class A158737 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158737() {
    super(1, new long[] {1, -3, 3}, new long[] {1260, 5148, 11628});
  }
}
