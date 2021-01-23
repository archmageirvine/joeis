package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029039 Expansion of 1/((1-x)(1-x^3)(1-x^5)(1-x^6)).
 * @author Sean A. Irvine
 */
public class A029039 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029039() {
    super(new long[] {-1, 1, 0, 1, -1, 1, 0, -1, -1, 0, 1, -1, 1, 0, 1}, new long[] {1, 1, 1, 2, 2, 3, 5, 5, 6, 8, 9, 11, 14, 15, 17});
  }
}
