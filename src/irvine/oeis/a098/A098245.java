package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098245 Chebyshev polynomials <code>S(n,227)</code>.
 * @author Sean A. Irvine
 */
public class A098245 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098245() {
    super(new long[] {-1, 227}, new long[] {1, 227});
  }
}
