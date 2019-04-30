package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097782 Chebyshev polynomials <code>S(n,29)</code> with Diophantine property.
 * @author Sean A. Irvine
 */
public class A097782 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097782() {
    super(new long[] {-1, 29}, new long[] {1, 29});
  }
}
