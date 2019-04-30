package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098292 First differences of Chebyshev polynomials <code>S(n</code>,731)=A098263(n) with Diophantine property.
 * @author Sean A. Irvine
 */
public class A098292 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098292() {
    super(new long[] {-1, 731}, new long[] {1, 730});
  }
}
