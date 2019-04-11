package irvine.oeis.a014;

import irvine.oeis.CoordinationSequence;

/**
 * A014670 G.f.: <code>(1+x)*(1+x^3)*(1+x^5)*(1+x^7)*(1+x^9)/((1-x^2)*(1-x^4)*(1-x^6)*(1-x^8)*(1-x^10))</code>.
 * @author Sean A. Irvine
 */
public class A014670 extends CoordinationSequence {

  /** Construct the sequence. */
  public A014670() {
    super(
      new long[] {1, 1, 0, 1, 1, 1, 1, 1, 2, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 0, 1, 1},
      new int[] {2, 4, 6, 8, 10});
  }
}
