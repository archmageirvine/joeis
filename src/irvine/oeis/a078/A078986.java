package irvine.oeis.a078;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A078986 Chebyshev T(n,19) polynomial.
 * @author Sean A. Irvine
 */
public class A078986 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078986() {
    super(new long[] {-1, 38}, new long[] {1, 19});
  }
}
