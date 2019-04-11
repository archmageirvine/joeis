package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159668 Expansion of <code>(1 - x)/(1 - 28*x + x^2)</code>.
 * @author Sean A. Irvine
 */
public class A159668 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159668() {
    super(new long[] {-1, 28}, new long[] {1, 27});
  }
}
