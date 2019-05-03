package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163200 Sum of the cubes of the first <code>n odd-indexed</code> Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A163200 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163200() {
    super(new long[] {-1, 21, -56, 21}, new long[] {0, 1, 9, 134});
  }
}
