package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098256 First differences of Chebyshev polynomials <code>S(n,443)=A098254(n)</code> with Diophantine property.
 * @author Sean A. Irvine
 */
public class A098256 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098256() {
    super(new long[] {-1, 443}, new long[] {1, 442});
  }
}
