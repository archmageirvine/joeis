package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097839 Chebyshev polynomials <code>S(n,83)</code>.
 * @author Sean A. Irvine
 */
public class A097839 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097839() {
    super(new long[] {-1, 83}, new long[] {1, 83});
  }
}
