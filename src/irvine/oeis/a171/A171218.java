package irvine.oeis.a171;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A171218 a(n) = Sum_{k=0..n} A109613(k)*A005843(n-k).
 * @author Sean A. Irvine
 */
public class A171218 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171218() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {0, 2, 6, 16, 32});
  }
}
