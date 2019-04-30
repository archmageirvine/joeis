package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098253 First differences of Chebyshev polynomials <code>S(n</code>,363)=A098251(n) with Diophantine property.
 * @author Sean A. Irvine
 */
public class A098253 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098253() {
    super(new long[] {-1, 363}, new long[] {1, 362});
  }
}
