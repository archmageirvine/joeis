package irvine.oeis.a097;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A097836 Chebyshev polynomials S(n,51).
 * @author Sean A. Irvine
 */
public class A097836 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097836() {
    super(new long[] {-1, 51}, new long[] {1, 51});
  }
}
