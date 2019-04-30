package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097313 Chebyshev polynomials of the second kind, <code>U(n,x)</code>, evaluated at <code>x=15</code>.
 * @author Sean A. Irvine
 */
public class A097313 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097313() {
    super(new long[] {-1, 30}, new long[] {0, 1});
  }
}
