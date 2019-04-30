package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098262 First differences of Chebyshev polynomials <code>S(n</code>,627)=A098260(n) with Diophantine property.
 * @author Sean A. Irvine
 */
public class A098262 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098262() {
    super(new long[] {-1, 627}, new long[] {1, 626});
  }
}
