package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022448 Expansion of 1/((1-x)*(1-5*x)*(1-6*x)*(1-12*x)).
 * @author Sean A. Irvine
 */
public class A022448 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022448() {
    super(new long[] {-360, 522, -185, 24}, new long[] {1, 24, 391, 5466});
  }
}
