package irvine.oeis.a120;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A120714 Expansion of 2*x^2*(7+14*x+4*x^2)/((1+x-x^2)*(1-2*x-10*x^2-6*x^3)).
 * @author Sean A. Irvine
 */
public class A120714 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120714() {
    super(1, new long[] {6, -2, -24, -3, 26, 15, 0}, new long[] {0, 14, 42, 232, 974, 4522, 20180});
  }
}
