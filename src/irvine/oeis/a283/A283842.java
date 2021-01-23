package irvine.oeis.a283;

import irvine.oeis.LinearRecurrence;

/**
 * A283842 Expansion of x^3*(2-3*x)/((1-x)^2*(1-2*x)*(1-5*x+5*x^2)).
 * @author Sean A. Irvine
 */
public class A283842 extends LinearRecurrence {

  /** Construct the sequence. */
  public A283842() {
    super(new long[] {10, -35, 47, -30, 9}, new long[] {0, 0, 0, 2, 15});
  }
}
