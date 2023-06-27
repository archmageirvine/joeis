package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158540 a(n) = 22*n^2 - 1.
 * @author Sean A. Irvine
 */
public class A158540 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158540() {
    super(1, new long[] {1, -3, 3}, new long[] {21, 87, 197});
  }
}
