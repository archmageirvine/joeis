package irvine.oeis.a220;

import irvine.oeis.LinearRecurrence;

/**
 * A220889 a(n) = F(n+8) - (1/6)*(n^4-2*n^3+26*n^2+47*n+132) where F(i) = Fibonacci numbers (A000045).
 * @author Sean A. Irvine
 */
public class A220889 extends LinearRecurrence {

  /** Construct the sequence. */
  public A220889() {
    super(new long[] {-1, 4, -4, -5, 15, -14, 6}, new long[] {0, 0, 0, 0, 1, 8, 35});
  }
}
