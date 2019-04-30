package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098252 Chebyshev polynomials <code>S(n,363) + S(n-1,363)</code> with Diophantine property.
 * @author Sean A. Irvine
 */
public class A098252 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098252() {
    super(new long[] {-1, 363}, new long[] {1, 364});
  }
}
