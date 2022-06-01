package irvine.oeis.a029;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A029062 Expansion of 1/((1-x)*(1-x^3)*(1-x^11)*(1-x^12)).
 * @author Sean A. Irvine
 */
public class A029062 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029062() {
    super(new long[] {-1, 1, 0, 1, -1, 0, 0, 0, 0, 0, 0, 1, 0, -1, -1, 0, 1, 0, 0, 0, 0, 0, 0, -1, 1, 0, 1}, new long[] {1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 5, 7, 7, 8, 10, 10, 11, 13, 13, 14, 16, 17, 19, 22, 23, 25});
  }
}
