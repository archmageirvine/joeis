package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097844 Chebyshev polynomials S(n,171).
 * @author Sean A. Irvine
 */
public class A097844 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097844() {
    super(new long[] {-1, 171}, new long[] {1, 171});
  }
}
