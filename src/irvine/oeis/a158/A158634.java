package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158634 a(n) = 46*n^2 - 1.
 * @author Sean A. Irvine
 */
public class A158634 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158634() {
    super(1, new long[] {1, -3, 3}, new long[] {45, 183, 413});
  }
}
