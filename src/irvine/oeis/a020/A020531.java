package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020531 <code>a(n) =</code> 5th Fibonacci polynomial evaluated at <code>2^n</code>.
 * @author Sean A. Irvine
 */
public class A020531 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020531() {
    super(new long[] {64, -84, 21}, new long[] {5, 29, 305});
  }
}
