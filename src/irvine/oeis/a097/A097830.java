package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097830 Partial sums of Chebyshev sequence <code>S(n,16) = U(n,16/2) =</code> A077412(n).
 * @author Sean A. Irvine
 */
public class A097830 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097830() {
    super(new long[] {1, -17, 17}, new long[] {1, 17, 272});
  }
}
