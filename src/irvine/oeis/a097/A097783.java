package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097783 Chebyshev polynomials <code>S(n,11) + S(n-1,11)</code> with Diophantine property.
 * @author Sean A. Irvine
 */
public class A097783 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097783() {
    super(new long[] {-1, 11}, new long[] {1, 12});
  }
}
