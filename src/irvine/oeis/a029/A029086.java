package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029086 Expansion of 1/((1-x)*(1-x^5)*(1-x^6)*(1-x^8)).
 * @author Sean A. Irvine
 */
public class A029086 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029086() {
    super(new long[] {-1, 1, 0, 0, 0, 1, 0, -1, 1, -1, 0, -1, 1, -1, 0, 1, 0, 0, 0, 1}, new long[] {1, 1, 1, 1, 1, 2, 3, 3, 4, 4, 5, 6, 7, 8, 9, 10, 12, 13, 15, 16});
  }
}
