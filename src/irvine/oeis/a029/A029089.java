package irvine.oeis.a029;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A029089 Expansion of 1/((1-x)*(1-x^5)*(1-x^6)*(1-x^11)).
 * @author Sean A. Irvine
 */
public class A029089 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029089() {
    super(new long[] {-1, 1, 0, 0, 0, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 1, 0, 0, 0, 1}, new long[] {1, 1, 1, 1, 1, 2, 3, 3, 3, 3, 4, 6, 7, 7, 7, 8, 10, 12, 13, 13, 14, 16, 19});
  }
}
