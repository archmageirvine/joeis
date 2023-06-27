package irvine.oeis.a123;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A123008 Expansion of x*(1 + 3*x)/(1 - 2*x - 25*x^2).
 * @author Sean A. Irvine
 */
public class A123008 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123008() {
    super(1, new long[] {25, 2}, new long[] {1, 5});
  }
}
