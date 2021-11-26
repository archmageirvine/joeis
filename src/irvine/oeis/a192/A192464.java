package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192464 Constant term of the reduction by x^2-&gt;x+1 of the polynomial p(n,x) = 1 + x^n + x^(2n).
 * @author Sean A. Irvine
 */
public class A192464 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192464() {
    super(new long[] {-1, 3, 1, -7, 5}, new long[] {2, 4, 7, 16, 38});
  }
}
