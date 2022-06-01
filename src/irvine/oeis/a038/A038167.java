package irvine.oeis.a038;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A038167 G.f.: x*(1+3*x+x^2)/((1-x^2)^2*(1-x^5)).
 * @author Sean A. Irvine
 */
public class A038167 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038167() {
    super(new long[] {1, 0, -2, 0, 1, -1, 0, 2, 0}, new long[] {0, 1, 3, 3, 6, 5, 10, 10, 15});
  }
}
