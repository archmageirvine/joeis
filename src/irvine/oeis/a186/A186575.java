package irvine.oeis.a186;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A186575 Expansion of (1 + 2*x + 6*x^2)/(1 - x - x^2 - 2*x^3) in powers of x.
 * @author Sean A. Irvine
 */
public class A186575 extends LinearRecurrence {

  /** Construct the sequence. */
  public A186575() {
    super(new long[] {2, 1, 1}, new long[] {1, 3, 10});
  }
}
