package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029005 Expansion of 1/((1-x)(1-x^2)(1-x^3)(1-x^11)).
 * @author Sean A. Irvine
 */
public class A029005 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029005() {
    super(new long[] {-1, 1, 1, 0, -1, -1, 1, 0, 0, 0, 0, 1, -1, -1, 0, 1, 1}, new long[] {1, 1, 2, 3, 4, 5, 7, 8, 10, 12, 14, 17, 20, 23, 27, 31, 35});
  }
}
