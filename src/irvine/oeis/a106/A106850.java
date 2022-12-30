package irvine.oeis.a106;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A106850 Expansion of 3*x^2*(2*x^2+9*x-2)/((3*x^2-5*x+1)*(3*x^2+5*x-1)).
 * @author Sean A. Irvine
 */
public class A106850 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106850() {
    super(new long[] {9, 0, -25, 10}, new long[] {0, 6, 33, 174});
  }
}
