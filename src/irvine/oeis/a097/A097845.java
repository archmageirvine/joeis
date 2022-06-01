package irvine.oeis.a097;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A097845 Chebyshev polynomials S(n,171) + S(n-1,171) with Diophantine property.
 * @author Sean A. Irvine
 */
public class A097845 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097845() {
    super(new long[] {-1, 171}, new long[] {1, 172});
  }
}
