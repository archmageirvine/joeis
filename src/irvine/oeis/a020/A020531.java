package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020531 a(n) = 5th Fibonacci polynomial evaluated at 2^n.
 * @author Sean A. Irvine
 */
public class A020531 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020531() {
    super(new long[] {64, -84, 21}, new long[] {5, 29, 305});
  }
}
