package irvine.oeis.a187;

import irvine.oeis.LinearRecurrence;

/**
 * A187397 Expansion of -2*x^4 *(3*x^13 +2*x^12 +x^11 -6*x^10 -10*x^9 -6*x^8 +x^7 +7*x^6 +5*x^5 -x^4 -8*x^3 -11*x^2 -8*x -5) / ((x -1)^4 *(x +1)^2 *(x^2 +1)^2 *(x^2 +x +1)^2).
 * @author Sean A. Irvine
 */
public class A187397 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187397() {
    super(new long[] {0, 0, 0, 0, -1, 0, 0, 2, 2, 0, -1, -4, -1, 0, 2, 2, 0, 0}, new long[] {0, 0, 0, 0, 10, 16, 22, 36, 54, 66, 92, 122, 156, 196, 240, 288, 366, 426});
  }
}
