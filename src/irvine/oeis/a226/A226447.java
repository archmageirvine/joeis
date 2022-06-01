package irvine.oeis.a226;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A226447 Expansion of (1-x+x^3)/(1-x^2+2*x^3-x^4).
 * @author Sean A. Irvine
 */
public class A226447 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226447() {
    super(new long[] {1, -2, 1, 0}, new long[] {1, -1, 1, -2});
  }
}
