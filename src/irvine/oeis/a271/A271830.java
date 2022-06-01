package irvine.oeis.a271;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A271830 Expansion of (3 - 4*x + 3*x^2 + x^4)/((1 - x)^2*(1 + x^2 + x^4)).
 * @author Sean A. Irvine
 */
public class A271830 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271830() {
    super(new long[] {-1, 2, -2, 2, -2, 2}, new long[] {3, 2, 1, 4, 5, 6});
  }
}
