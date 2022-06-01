package irvine.oeis.a029;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A029103 Expansion of 1/((1-x)(1-x^5)(1-x^10)(1-x^11)).
 * @author Sean A. Irvine
 */
public class A029103 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029103() {
    super(new long[] {-1, 1, 0, 0, 0, 1, -1, 0, 0, 0, 1, 0, -1, 0, 0, -1, 0, 1, 0, 0, 0, -1, 1, 0, 0, 0, 1}, new long[] {1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 4, 5, 5, 5, 5, 7, 8, 8, 8, 8, 11, 13, 14, 14, 14, 17, 19});
  }
}
