package irvine.oeis.a049;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A049676 a(n) = (F(8*n+3) + F(8*n+1))/3, where F = A000045 (the Fibonacci sequence).
 * @author Sean A. Irvine
 */
public class A049676 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049676() {
    super(new long[] {-1, 47}, new long[] {1, 41});
  }
}
