package irvine.oeis.a257;

import irvine.oeis.LinearRecurrence;

/**
 * A257595 Expansion of <code>x^3*(1+x+2*x^2+3*x^3+3*x^4+x^5)/(1-x^2-x^3)^3</code>.
 * @author Sean A. Irvine
 */
public class A257595 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257595() {
    super(new long[] {1, 3, 3, -2, -6, -3, 3, 3, 0}, new long[] {0, 0, 0, 1, 1, 5, 9, 18, 34});
  }
}
