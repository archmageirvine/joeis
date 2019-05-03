package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049655 <code>a(n) = (F(8n+2)-1)/3</code>, where <code>F=A000045 (the</code> Fibonacci sequence).
 * @author Sean A. Irvine
 */
public class A049655 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049655() {
    super(new long[] {1, -48, 48}, new long[] {0, 18, 861});
  }
}
