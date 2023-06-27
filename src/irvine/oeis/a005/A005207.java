package irvine.oeis.a005;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A005207 a(n) = (F(2*n-1) + F(n+1))/2 where F(n) is a Fibonacci number.
 * @author Sean A. Irvine
 */
public class A005207 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005207() {
    super(1, new long[] {1, -2, -3, 4}, new long[] {1, 2, 4, 9});
  }
}
