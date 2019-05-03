package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098247 First differences of Chebyshev polynomials <code>S(n,227)=A098245(n)</code> with Diophantine property.
 * @author Sean A. Irvine
 */
public class A098247 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098247() {
    super(new long[] {-1, 227}, new long[] {1, 226});
  }
}
