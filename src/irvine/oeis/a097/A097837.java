package irvine.oeis.a097;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A097837 Chebyshev polynomials S(n,51) + S(n-1,51) with Diophantine property.
 * @author Sean A. Irvine
 */
public class A097837 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097837() {
    super(new long[] {-1, 51}, new long[] {1, 52});
  }
}
