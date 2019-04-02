package irvine.oeis.a160;

import irvine.oeis.LinearRecurrence;

/**
 * A160829 Expansion of (1 + 44*x + 337*x^2 + 612*x^3 + 305*x^4 + 40*x^5 + x^6)/(1 - x)^7.
 * @author Sean A. Irvine
 */
public class A160829 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160829() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 51, 673, 4287, 17931, 57321, 152251});
  }
}
