package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097835 First differences of Chebyshev polynomials <code>S(n,27) =</code> A097781(n) with Diophantine property.
 * @author Sean A. Irvine
 */
public class A097835 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097835() {
    super(new long[] {-1, 27}, new long[] {1, 26});
  }
}
