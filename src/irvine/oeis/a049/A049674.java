package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049674 a(n) = (F(3*n) - 2*F(n))/6, where F=A000045 (the Fibonacci sequence).
 * @author Sean A. Irvine
 */
public class A049674 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049674() {
    super(new long[] {-1, -5, -2, 5}, new long[] {0, 0, 1, 5});
  }
}
