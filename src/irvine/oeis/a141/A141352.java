package irvine.oeis.a141;

import irvine.oeis.LinearRecurrence;

/**
 * A141352 Expansion of <code>(1-2x-5x^2-7x^3+x^6)/((1-x)(1-x^3)^2)</code>.
 * @author Sean A. Irvine
 */
public class A141352 extends LinearRecurrence {

  /** Construct the sequence. */
  public A141352() {
    super(new long[] {1, -1, 0, -2, 2, 0, 1}, new long[] {1, -1, -6, -11, -15, -25, -35});
  }
}
