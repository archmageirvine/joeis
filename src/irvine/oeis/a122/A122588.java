package irvine.oeis.a122;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A122588 Expansion of x/(1 - 9*x + 28*x^2 - 35*x^3 + 15*x^4 - x^5).
 * @author Sean A. Irvine
 */
public class A122588 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122588() {
    super(new long[] {1, -15, 35, -28, 9}, new long[] {1, 9, 53, 260, 1156});
  }
}
