package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049659 a(n) = (F(8*n+6) - 2)/3, where F=A000045 (the Fibonacci sequence).
 * @author Sean A. Irvine
 */
public class A049659 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049659() {
    super(new long[] {1, -48, 48}, new long[] {2, 125, 5903});
  }
}
