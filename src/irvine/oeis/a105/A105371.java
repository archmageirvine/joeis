package irvine.oeis.a105;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A105371 Expansion of (1-x)*(1-x+x^2)/(1-3*x+4*x^2-2*x^3+x^4).
 * @author Sean A. Irvine
 */
public class A105371 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105371() {
    super(new long[] {-1, 2, -4, 3}, new long[] {1, 1, 1, 0});
  }
}
