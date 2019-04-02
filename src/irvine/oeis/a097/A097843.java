package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097843 First differences of Chebyshev polynomials S(n,123) = A049670(n+1) with Diophantine property.
 * @author Sean A. Irvine
 */
public class A097843 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097843() {
    super(new long[] {-1, 123}, new long[] {1, 122});
  }
}
