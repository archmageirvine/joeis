package irvine.oeis.a049;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A049657 a(n) = (F(8*n+3) - 2)/3, where F=A000045 (the Fibonacci sequence).
 * @author Sean A. Irvine
 */
public class A049657 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049657() {
    super(new long[] {1, -48, 48}, new long[] {0, 29, 1393});
  }
}
