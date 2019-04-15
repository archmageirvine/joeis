package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097310 Chebyshev T-polynomials <code>T(n,14)</code> with Diophantine property.
 * @author Sean A. Irvine
 */
public class A097310 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097310() {
    super(new long[] {-1, 28}, new long[] {1, 14});
  }
}
