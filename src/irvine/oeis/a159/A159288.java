package irvine.oeis.a159;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A159288 Expansion of (1 + x + x^2)/(1 - x^2 - 2*x^3).
 * @author Sean A. Irvine
 */
public class A159288 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159288() {
    super(new long[] {2, 1, 0}, new long[] {1, 1, 2});
  }
}
