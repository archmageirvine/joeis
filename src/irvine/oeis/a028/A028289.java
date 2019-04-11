package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028289 Expansion of <code>(1+x^2+x^3+x^5)/((1-x)(1-x^3)(1-x^4)(1-x^6))</code>.
 * @author Sean A. Irvine
 */
public class A028289 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028289() {
    super(new long[] {-1, 1, 1, 1, -2, -2, 1, 1, 1}, new long[] {1, 1, 2, 4, 5, 7, 11, 13, 17});
  }
}
