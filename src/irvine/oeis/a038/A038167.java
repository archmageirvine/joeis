package irvine.oeis.a038;

import irvine.oeis.LinearRecurrence;

/**
 * A038167 G.f.: <code>x*(1+3*x+x^2)/((1-x^2)^2*(1-x^5))</code>.
 * @author Sean A. Irvine
 */
public class A038167 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038167() {
    super(new long[] {1, 0, -2, 0, 1, -1, 0, 2, 0}, new long[] {0, 1, 3, 3, 6, 5, 10, 10, 15});
  }
}
