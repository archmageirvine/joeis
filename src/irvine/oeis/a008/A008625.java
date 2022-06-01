package irvine.oeis.a008;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A008625 G.f.: (1+x^3)*(1+x^5)*(1+x^6)/((1-x^4)*(1-x^6)*(1-x^7)) (or (1+x^5)(1+x^6)/((1-x^3)*(1-x^4)*(1-x^7))).
 * @author Sean A. Irvine
 */
public class A008625 extends LinearRecurrence {

  /** Construct the sequence. */
  public A008625() {
    super(new long[] {1, -1, 0, -1, 1, 0, 0, -1, 1, 0, 1},
      new long[] {1, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3});
  }
}

