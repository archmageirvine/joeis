package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049663 <code>a(n) = (F(6*n+5) - 1)/4,</code> where F=A000045 (the Fibonacci sequence).
 * @author Sean A. Irvine
 */
public class A049663 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049663() {
    super(new long[] {1, -19, 19}, new long[] {1, 22, 399});
  }
}
