package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025169 <code>a(n) = 2*F(2*n+2)</code>, where <code>F(n)=A000045(n)</code> (the Fibonacci sequence).
 * @author Sean A. Irvine
 */
public class A025169 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025169() {
    super(new long[] {-1, 3}, new long[] {2, 6});
  }
}
