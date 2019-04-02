package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042120 Numerators of continued fraction convergents to sqrt(585).
 * @author Sean A. Irvine
 */
public class A042120 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042120() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 66562, 0, 0, 0, 0, 0, 0, 0}, new long[] {24, 121, 266, 387, 1814, 2201, 6216, 33281, 1603704, 8051801, 17707306, 25759107, 120743734, 146502841, 413749416, 2215249921L});
  }
}
