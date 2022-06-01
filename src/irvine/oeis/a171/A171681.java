package irvine.oeis.a171;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A171681 a(n) = F(2n+1)^3 - F(3n)^2 - F(6n-2), where the F(i) are Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A171681 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171681() {
    super(new long[] {-1, 20, -35, -35, 20}, new long[] {1, 6, 54, 857, 15058});
  }
}
