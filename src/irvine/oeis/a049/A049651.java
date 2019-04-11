package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049651 <code>a(n) =</code> (F(3*n+1) <code>- 1)/2,</code> where F=A000045 (the Fibonacci sequence).
 * @author Sean A. Irvine
 */
public class A049651 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049651() {
    super(new long[] {-1, -3, 5}, new long[] {0, 1, 6});
  }
}
