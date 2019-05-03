package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049673 <code>a(n) = (F(3n) + F(n))/3</code>, where F <code>= A000045 (the</code> Fibonacci sequence).
 * @author Sean A. Irvine
 */
public class A049673 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049673() {
    super(new long[] {-1, -5, -2, 5}, new long[] {0, 1, 3, 12});
  }
}
