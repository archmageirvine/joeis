package irvine.oeis.a005;

import irvine.oeis.LinearRecurrence;

/**
 * A005207 <code>a(n) =</code> (F(2*n-1) + F(n+1))/2 where F(n) is a Fibonacci number.
 * @author Sean A. Irvine
 */
public class A005207 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005207() {
    super(new long[] {1, -2, -3, 4}, new long[] {1, 2, 4, 9});
  }
}
