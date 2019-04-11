package irvine.oeis.a276;

import irvine.oeis.LinearRecurrence;

/**
 * A276265 Expansion of <code>(1 + 2*x)/(1 - 6*x + 6*x^2)</code>.
 * @author Sean A. Irvine
 */
public class A276265 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276265() {
    super(new long[] {-6, 6}, new long[] {1, 8});
  }
}
