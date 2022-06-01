package irvine.oeis.a107;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A107351 Expansion of (1+x^3)/((1-x)^3*(1-x^2)^3*(1-x^3)).
 * @author Sean A. Irvine
 */
public class A107351 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107351() {
    super(new long[] {1, -4, 4, 3, -6, 0, 0, 6, -3, -4, 4}, new long[] {1, 3, 9, 21, 45, 87, 159, 273, 450, 712, 1092});
  }
}
