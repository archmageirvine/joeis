package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106691 Expansion of g.f. (1+x-2*x^2+x^3+x^4)/((1-x)^2*(1+x)^2*(1+2*x)^2).
 * @author Sean A. Irvine
 */
public class A106691 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106691() {
    super(new long[] {-4, -4, 7, 8, -2, -4}, new long[] {1, -3, 8, -17, 36, -71});
  }
}
