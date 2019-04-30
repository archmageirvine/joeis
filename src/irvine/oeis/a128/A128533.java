package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128533 <code>a(n) = F(n)*L(n+2)</code> where F=Fibonacci and L=Lucas numbers.
 * @author Sean A. Irvine
 */
public class A128533 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128533() {
    super(new long[] {-1, 2, 2}, new long[] {0, 4, 7});
  }
}
