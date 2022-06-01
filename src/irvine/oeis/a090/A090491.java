package irvine.oeis.a090;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A090491 G.f.: (1+x^3+x^4+x^5+x^6+x^9)/((1-x)*(1-x^2)^2*(1-x^3)*(1-x^4)).
 * @author Sean A. Irvine
 */
public class A090491 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090491() {
    super(new long[] {1, -2, 0, 1, 0, 2, -2, 0, -1, 0, 2}, new long[] {1, 1, 3, 5, 10, 15, 26, 37, 57, 79, 112});
  }
}
