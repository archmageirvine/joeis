package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158554 a(n) = 28*n^2 - 1.
 * @author Sean A. Irvine
 */
public class A158554 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158554() {
    super(1, new long[] {1, -3, 3}, new long[] {27, 111, 251});
  }
}
