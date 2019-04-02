package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029010 Expansion of 1/((1-x)(1-x^2)(1-x^4)(1-x^11)).
 * @author Sean A. Irvine
 */
public class A029010 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029010() {
    super(new long[] {-1, 1, 1, -1, 1, -1, -1, 1, 0, 0, 0, 1, -1, -1, 1, -1, 1, 1}, new long[] {1, 1, 2, 2, 4, 4, 6, 6, 9, 9, 12, 13, 17, 18, 22, 24, 29, 31});
  }
}
