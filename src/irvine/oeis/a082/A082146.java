package irvine.oeis.a082;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A082146 G.f.: (1+x^5)/((1-x^2)*(1-x^3)*(1-x^4)*(1-x^6)).
 * @author Sean A. Irvine
 */
public class A082146 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082146() {
    super(new long[] {-1, 1, 0, 1, 0, -1, 1, -2, 1, -1, 0, 1, 0, 1}, new long[] {1, 0, 1, 1, 2, 2, 4, 3, 6, 6, 8, 9, 13, 12});
  }
}
