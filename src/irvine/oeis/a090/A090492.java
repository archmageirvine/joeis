package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090492 G.f.: (1+x^10)/((1-x^2)*(1-x^3)*(1-x^4)*(1-x^5)).
 * @author Sean A. Irvine
 */
public class A090492 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090492() {
    super(new long[] {-1, 0, 2, 1, -1, -1, 0, -1, -1, 1, 2, 0}, new long[] {1, 0, 1, 1, 2, 2, 3, 3, 5, 5, 8, 7});
  }
}
