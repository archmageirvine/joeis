package irvine.oeis.a106;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A106632 Expansion of g.f. -(1+27*x^2)/((1+3*x)*(1-2*x+9*x^2)).
 * @author Sean A. Irvine
 */
public class A106632 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106632() {
    super(new long[] {-27, -3, -1}, new long[] {-1, 1, -25});
  }
}
