package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077879 Expansion of (1-x)^(-1)/(1-2*x^2-2*x^3).
 * @author Sean A. Irvine
 */
public class A077879 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077879() {
    super(new long[] {-2, 0, 2, 1}, new long[] {1, 1, 3, 5});
  }
}
