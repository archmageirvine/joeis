package irvine.oeis.a209;

import irvine.oeis.LinearRecurrence;

/**
 * A209404 Negated coefficients of Chebyshev T polynomials: a(n) = -A053120(n+14, n), n &gt;= 0.
 * @author Sean A. Irvine
 */
public class A209404 extends LinearRecurrence {

  /** Construct the sequence. */
  public A209404() {
    super(new long[] {-256, 1024, -1792, 1792, -1120, 448, -112, 16}, new long[] {1, 15, 128, 816, 4320, 20064, 84480, 329472});
  }
}
