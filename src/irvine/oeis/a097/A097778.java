package irvine.oeis.a097;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A097778 Chebyshev polynomials S(n,23) with Diophantine property.
 * @author Sean A. Irvine
 */
public class A097778 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097778() {
    super(new long[] {-1, 23}, new long[] {1, 23});
  }
}
