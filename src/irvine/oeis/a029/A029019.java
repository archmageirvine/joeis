package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029019 Expansion of 1/((1-x)(1-x^2)(1-x^6)(1-x^11)).
 * @author Sean A. Irvine
 */
public class A029019 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029019() {
    super(new long[] {-1, 1, 1, -1, 0, 0, 1, -1, -1, 1, 0, 1, -1, -1, 1, 0, 0, -1, 1, 1}, new long[] {1, 1, 2, 2, 3, 3, 5, 5, 7, 7, 9, 10, 13, 14, 17, 18, 21, 23, 27, 29});
  }
}
