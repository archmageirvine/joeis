package irvine.oeis.a188;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A188444 Expansion of (1+x)*(1+x+x^2)*(1-x+x^2-4*x+x^4-x^5+x^6)/(1+x^4)^3.
 * @author Sean A. Irvine
 */
public class A188444 extends LinearRecurrence {

  /** Construct the sequence. */
  public A188444() {
    super(new long[] {-1, 0, 0, 0, -3, 0, 0, 0, -3, 0, 0, 0}, new long[] {1, 1, 1, -3, -9, -9, -6, 10, 25, 25, 15, -21});
  }
}
