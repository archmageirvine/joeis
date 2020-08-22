package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122767 Expansion of 2*x/(1-6*x-120*x^2+300*x^3).
 * @author Sean A. Irvine
 */
public class A122767 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122767() {
    super(new long[] {-300, 120, 6}, new long[] {0, 2, 12});
  }
}
