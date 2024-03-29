package irvine.oeis.a068;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A068548 Coefficients of (-x^(2n-6)) in Chebyshev polynomial of degree 2n.
 * @author Sean A. Irvine
 */
public class A068548 extends LinearRecurrence {

  /** Construct the sequence. */
  public A068548() {
    super(1, new long[] {-256, 256, -96, 16}, new long[] {1, 32, 400, 3584});
  }
}
