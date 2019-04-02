package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158592 a(n) = 361*n^2 + 19.
 * @author Sean A. Irvine
 */
public class A158592 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158592() {
    super(new long[] {1, -3, 3}, new long[] {19, 380, 1463});
  }
}
