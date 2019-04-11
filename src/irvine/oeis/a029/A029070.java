package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029070 Expansion of <code>1/((1-x)*(1-x^4)*(1-x^6)*(1-x^7))</code>.
 * @author Sean A. Irvine
 */
public class A029070 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029070() {
    super(new long[] {-1, 1, 0, 0, 1, -1, 1, 0, -1, 0, -1, 0, 1, -1, 1, 0, 0, 1}, new long[] {1, 1, 1, 1, 2, 2, 3, 4, 5, 5, 6, 7, 9, 10, 12, 13, 15, 16});
  }
}
