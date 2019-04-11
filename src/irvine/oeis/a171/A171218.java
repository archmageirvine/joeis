package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171218 <code>a(n) =</code> sum(A109613(k)*A005843(n-k): 0&lt;=k&lt;=n).
 * @author Sean A. Irvine
 */
public class A171218 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171218() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {0, 2, 6, 16, 32});
  }
}
