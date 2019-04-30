package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098257 Chebyshev polynomials <code>S(n,531)</code>.
 * @author Sean A. Irvine
 */
public class A098257 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098257() {
    super(new long[] {-1, 531}, new long[] {1, 531});
  }
}
