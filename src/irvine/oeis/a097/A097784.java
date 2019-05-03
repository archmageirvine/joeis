package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097784 Partial sums of Chebyshev sequence <code>S(n,10) = U(n,5) = A004189(n+1)</code>.
 * @author Sean A. Irvine
 */
public class A097784 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097784() {
    super(new long[] {1, -11, 11}, new long[] {1, 11, 110});
  }
}
