package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158187 a(n) = 10*n^2 + 1.
 * @author Sean A. Irvine
 */
public class A158187 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158187() {
    super(new long[] {1, -3, 3}, new long[] {1, 11, 41});
  }
}
