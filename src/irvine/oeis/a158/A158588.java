package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158588 a(n) = 34*n^2 - 1.
 * @author Sean A. Irvine
 */
public class A158588 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158588() {
    super(new long[] {1, -3, 3}, new long[] {33, 135, 305});
  }
}
