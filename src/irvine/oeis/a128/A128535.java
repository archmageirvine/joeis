package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128535 a(n) = F(n)*L(n-2) where F = Fibonacci and L = Lucas numbers.
 * @author Sean A. Irvine
 */
public class A128535 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128535() {
    super(new long[] {-1, 2, 2}, new long[] {0, -1, 2});
  }
}
