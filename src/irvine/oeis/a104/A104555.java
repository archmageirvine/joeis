package irvine.oeis.a104;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A104555 Expansion of x(1 - x)/(1 - x + x^2)^3.
 * @author Sean A. Irvine
 */
public class A104555 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104555() {
    super(new long[] {-1, 3, -6, 7, -6, 3}, new long[] {0, 1, 2, 0, -5, -7});
  }
}
