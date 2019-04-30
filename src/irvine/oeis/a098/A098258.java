package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098258 Chebyshev polynomials <code>S(n,531) + S(n-1,531)</code> with Diophantine property.
 * @author Sean A. Irvine
 */
public class A098258 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098258() {
    super(new long[] {-1, 531}, new long[] {1, 532});
  }
}
