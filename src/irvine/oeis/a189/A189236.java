package irvine.oeis.a189;

import irvine.oeis.LinearRecurrence;

/**
 * A189236 Expansion of (5-8*x-15*x^2+4*x^3+4*x^4)/(1-2*x-5*x^2+2*x^3+4*x^4+x^5).
 * @author Sean A. Irvine
 */
public class A189236 extends LinearRecurrence {

  /** Construct the sequence. */
  public A189236() {
    super(new long[] {-1, -4, -2, 5, 2}, new long[] {5, 2, 14, 32, 114});
  }
}
