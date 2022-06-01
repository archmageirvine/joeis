package irvine.oeis.a049;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A049658 a(n) = (F(8*n+5) - 2)/3, where F=A000045 (the Fibonacci sequence).
 * @author Sean A. Irvine
 */
public class A049658 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049658() {
    super(new long[] {1, -48, 48}, new long[] {1, 77, 3648});
  }
}
