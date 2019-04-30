package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097834 Chebyshev polynomials <code>S(n,27) + S(n-1,27)</code> with Diophantine property.
 * @author Sean A. Irvine
 */
public class A097834 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097834() {
    super(new long[] {-1, 27}, new long[] {1, 28});
  }
}
