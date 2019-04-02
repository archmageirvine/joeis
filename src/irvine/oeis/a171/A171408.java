package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171408 a(n) = A171373(n+1) - 2*A171373(n).
 * @author Sean A. Irvine
 */
public class A171408 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171408() {
    super(new long[] {-1, 2, -4, 3}, new long[] {4, 4, 4, 4});
  }
}
