package irvine.oeis.a246;

import irvine.oeis.LinearRecurrence;

/**
 * A246986 Expansion of (1-5*x+6*x^2-x^3)/((1-x)*(1-2*x)*(1-3*x)*(1-4*x)).
 * @author Sean A. Irvine
 */
public class A246986 extends LinearRecurrence {

  /** Construct the sequence. */
  public A246986() {
    super(new long[] {-24, 50, -35, 10}, new long[] {1, 5, 21, 84});
  }
}
