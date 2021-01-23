package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029023 Expansion of 1/((1-x)(1-x^2)(1-x^7)(1-x^11)).
 * @author Sean A. Irvine
 */
public class A029023 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029023() {
    super(new long[] {-1, 1, 1, -1, 0, 0, 0, 1, -1, -1, 1, 1, -1, -1, 1, 0, 0, 0, -1, 1, 1}, new long[] {1, 1, 2, 2, 3, 3, 4, 5, 6, 7, 8, 10, 11, 13, 15, 17, 19, 21, 24, 26, 29});
  }
}
