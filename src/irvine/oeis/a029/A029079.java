package irvine.oeis.a029;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A029079 Expansion of 1/((1-x)(1-x^4)(1-x^8)(1-x^11)).
 * @author Sean A. Irvine
 */
public class A029079 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029079() {
    super(new long[] {-1, 1, 0, 0, 1, -1, 0, 0, 1, -1, 0, 1, -2, 1, 0, -1, 1, 0, 0, -1, 1, 0, 0, 1}, new long[] {1, 1, 1, 1, 2, 2, 2, 2, 4, 4, 4, 5, 7, 7, 7, 8, 11, 11, 11, 13, 16, 16, 17, 19});
  }
}
