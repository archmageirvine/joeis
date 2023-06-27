package irvine.oeis.a122;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A122502 Expansion of x/(1 - 22 x^2 - 54 x^3 - 38 x^4).
 * @author Sean A. Irvine
 */
public class A122502 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122502() {
    super(1, new long[] {38, 54, 22, 0}, new long[] {0, 1, 0, 22});
  }
}
