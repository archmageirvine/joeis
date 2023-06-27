package irvine.oeis.a159;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A159673 Expansion of 56*x^2/(1 - 783*x + 783*x^2 - x^3).
 * @author Sean A. Irvine
 */
public class A159673 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159673() {
    super(1, new long[] {1, -783, 783}, new long[] {0, 56, 43848});
  }
}
