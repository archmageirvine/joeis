package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049654 a(n) = (F(8*n+1) - 1)/3 where F=A000045 (the Fibonacci sequence).
 * @author Sean A. Irvine
 */
public class A049654 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049654() {
    super(new long[] {1, -48, 48}, new long[] {0, 11, 532});
  }
}
