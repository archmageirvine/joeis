package irvine.oeis.a121;

import irvine.oeis.LinearRecurrence;

/**
 * A121962 Star of David bonding digraph: characteristic polynomial: x(-18 - 10 x + 147 x^2 + 71 x^3 - 312 x^4 - 221 x^5 + 140 x^6 + 121 x^7 - 17 x^8 - 21 x^9 + x^11).
 * @author Sean A. Irvine
 */
public class A121962 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121962() {
    super(new long[] {18, 10, -147, -71, 312, 221, -140, -121, 17, 21, 0}, new long[] {0, 104, 217, 1100, 4030, 17417, 69886, 293094, 1198262, 4975116, 20455103});
  }
}
