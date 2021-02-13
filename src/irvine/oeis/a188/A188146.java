package irvine.oeis.a188;

import irvine.oeis.LinearRecurrence;

/**
 * A188146 Three interleaved 1st-order polynomials: a(3*n) = 1+4*n, a(1+3*n) = 3+4*n, a(2+3*n) = 1+n.
 * @author Sean A. Irvine
 */
public class A188146 extends LinearRecurrence {

  /** Construct the sequence. */
  public A188146() {
    super(new long[] {-1, 0, 0, 2, 0, 0}, new long[] {1, 3, 1, 5, 7, 2});
  }
}
