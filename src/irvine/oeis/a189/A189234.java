package irvine.oeis.a189;

import irvine.oeis.LinearRecurrence;

/**
 * A189234 Expansion of <code>(5-4*x-12*x^2+6*x^3+3*x^4)/(1-x-4*x^2+3*x^3+3*x^4-x^5)</code>.
 * @author Sean A. Irvine
 */
public class A189234 extends LinearRecurrence {

  /** Construct the sequence. */
  public A189234() {
    super(new long[] {1, -3, -3, 4, 1}, new long[] {5, 1, 9, 4, 25});
  }
}
