package irvine.oeis.a141;

import irvine.oeis.LinearRecurrence;

/**
 * A141365 Expansion of <code>(1-5x^2-7x^3-2x^4+x^6)/((1-x)(1-x^3)^2)</code>.
 * @author Sean A. Irvine
 */
public class A141365 extends LinearRecurrence {

  /** Construct the sequence. */
  public A141365() {
    super(new long[] {1, -1, 0, -2, 2, 0, 1}, new long[] {1, 1, -4, -9, -11, -21, -31});
  }
}
