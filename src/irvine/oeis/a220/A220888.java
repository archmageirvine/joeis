package irvine.oeis.a220;

import irvine.oeis.LinearRecurrence;

/**
 * A220888 a(n) = F(n+7) - (1/2)*(n^3+2*n^2+13*n+26) where F(i) is a Fibonacci number (A000045).
 * @author Sean A. Irvine
 */
public class A220888 extends LinearRecurrence {

  /** Construct the sequence. */
  public A220888() {
    super(new long[] {1, -3, 1, 6, -9, 5}, new long[] {0, 0, 0, 0, 2, 11});
  }
}
