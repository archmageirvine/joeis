package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049664 <code>a(n) = (F(6*n+3) - 2)/32</code>, where <code>F=A000045 (the</code> Fibonacci sequence).
 * @author Sean A. Irvine
 */
public class A049664 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049664() {
    super(new long[] {1, -19, 19}, new long[] {0, 1, 19});
  }
}
