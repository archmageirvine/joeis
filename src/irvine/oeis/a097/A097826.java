package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097826 Partial sums of Chebyshev sequence <code>S(n,11) = U(n,11/2) = A004190(n)</code>.
 * @author Sean A. Irvine
 */
public class A097826 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097826() {
    super(new long[] {1, -12, 12}, new long[] {1, 12, 132});
  }
}
