package irvine.oeis.a274;

import irvine.oeis.LinearRecurrence;

/**
 * A274583 Expansion of <code>(1 + x + x^2 - x^3 - x^4 + x^6)/((1 - x)^3*(1 + x + x^2)^2)</code>.
 * @author Sean A. Irvine
 */
public class A274583 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274583() {
    super(new long[] {1, -1, 0, -2, 2, 0, 1}, new long[] {1, 2, 3, 4, 5, 7, 9});
  }
}
