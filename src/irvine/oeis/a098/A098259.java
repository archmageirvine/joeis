package irvine.oeis.a098;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A098259 First differences of Chebyshev polynomials S(n,531)=A098257(n) with Diophantine property.
 * @author Sean A. Irvine
 */
public class A098259 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098259() {
    super(new long[] {-1, 531}, new long[] {1, 530});
  }
}
