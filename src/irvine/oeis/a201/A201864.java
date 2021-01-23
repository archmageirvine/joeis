package irvine.oeis.a201;

import irvine.oeis.LinearRecurrence;

/**
 * A201864 ((F(n-1)+F(n-2))-1)/2 if F(n) is odd, otherwise ((F(n-1)+F(n-2))-2)/2, where F(n)=A000045(n) is the n-th Fibonacci number.
 * @author Sean A. Irvine
 */
public class A201864 extends LinearRecurrence {

  /** Construct the sequence. */
  public A201864() {
    super(new long[] {-1, -1, 1, 1, 1}, new long[] {0, 0, 0, 1, 2});
  }
}
