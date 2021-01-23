package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029048 Expansion of 1/((1-x)(1-x^3)(1-x^6)(1-x^11)).
 * @author Sean A. Irvine
 */
public class A029048 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029048() {
    super(new long[] {-1, 1, 0, 1, -1, 0, 1, -1, 0, -1, 1, 1, -1, 0, -1, 1, 0, -1, 1, 0, 1}, new long[] {1, 1, 1, 2, 2, 2, 4, 4, 4, 6, 6, 7, 10, 10, 11, 14, 14, 16, 20, 20, 22});
  }
}
