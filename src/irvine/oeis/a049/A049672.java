package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049672 <code>a(n) = (F(4*n) - F(n))/2</code>, where <code>F=A000045</code> (the Fibonacci sequence).
 * @author Sean A. Irvine
 */
public class A049672 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049672() {
    super(new long[] {1, -6, -7, 8}, new long[] {0, 1, 10, 71});
  }
}
