package irvine.oeis.a127;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A127630 Expansion of (1+x-x^2-x^3)/(1+x^2)^2.
 * @author Sean A. Irvine
 */
public class A127630 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127630() {
    super(new long[] {-1, 0, -2, 0}, new long[] {1, 1, -3, -3});
  }
}
