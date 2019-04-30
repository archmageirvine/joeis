package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097781 Chebyshev polynomials <code>S(n,27)</code> with Diophantine property.
 * @author Sean A. Irvine
 */
public class A097781 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097781() {
    super(new long[] {-1, 27}, new long[] {1, 27});
  }
}
