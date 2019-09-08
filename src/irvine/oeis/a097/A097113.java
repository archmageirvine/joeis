package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097113 Expansion of <code>(1 + 5*x - 12*x^2 - 80*x^3)/(1 - 33*x^2 + 272*x^4)</code>.
 * @author Sean A. Irvine
 */
public class A097113 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097113() {
    super(new long[] {-272, 0, 33, 0}, new long[] {1, 5, 21, 85});
  }
}
