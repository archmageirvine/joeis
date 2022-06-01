package irvine.oeis.a123;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A123960 Expansion of 2*x^4 / (1 - 11*x + 45*x^2 - 80*x^3 + 49*x^4).
 * @author Sean A. Irvine
 */
public class A123960 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123960() {
    super(new long[] {-49, 80, -45, 11}, new long[] {0, 0, 0, 2});
  }
}
