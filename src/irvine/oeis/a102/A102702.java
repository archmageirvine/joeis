package irvine.oeis.a102;

import irvine.oeis.LinearRecurrence;

/**
 * A102702 Expansion of (2-x-2*x^2-x^3)/(1-x-x^2)^2.
 * @author Sean A. Irvine
 */
public class A102702 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102702() {
    super(new long[] {-1, -2, 1, 2}, new long[] {2, 3, 6, 10});
  }
}
