package irvine.oeis.a109;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A109544 Expansion of (1 + x - x^3 - 2*x^4)/(1 - x^2 - x^3 - x^4 - x^5).
 * @author Sean A. Irvine
 */
public class A109544 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109544() {
    super(new long[] {1, 1, 1, 1, 0}, new long[] {1, 1, 1, 1, 1});
  }
}
