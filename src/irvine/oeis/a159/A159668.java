package irvine.oeis.a159;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A159668 Expansion of (1 - x)/(1 - 28*x + x^2).
 * @author Sean A. Irvine
 */
public class A159668 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159668() {
    super(new long[] {-1, 28}, new long[] {1, 27});
  }
}
