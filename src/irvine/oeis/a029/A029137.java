package irvine.oeis.a029;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A029137 Expansion of 1/((1-x^2)*(1-x^3)*(1-x^4)*(1-x^7)).
 * @author Sean A. Irvine
 */
public class A029137 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029137() {
    super(new long[] {-1, 0, 1, 1, 1, -1, -1, 0, 0, 0, -1, -1, 1, 1, 1, 0}, new long[] {1, 0, 1, 1, 2, 1, 3, 3, 4, 4, 6, 6, 8, 8, 11, 11});
  }
}
