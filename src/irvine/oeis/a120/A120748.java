package irvine.oeis.a120;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A120748 Expansion of -x^2*(-1 - 2*x + x^2)/(1 - x - 3*x^2 - x^3 + x^4).
 * @author Sean A. Irvine
 */
public class A120748 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120748() {
    super(new long[] {-1, 1, 3, 1}, new long[] {0, 1, 3, 5});
  }
}
