package irvine.oeis.a019;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A019484 Expansion of (8 + 7 x - 7 x^2 - 7 x^3)/(1 - 6 x - 7 x^2 + 5 x^3 + 6 x^4).
 * @author Sean A. Irvine
 */
public class A019484 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019484() {
    super(new long[] {-6, -5, 7, 6}, new long[] {8, 55, 379, 2612});
  }
}
