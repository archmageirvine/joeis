package irvine.oeis.a175;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A175790 Expansion of 1/((1 - x^3 - x^4)*(1 + x)).
 * @author Sean A. Irvine
 */
public class A175790 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175790() {
    super(new long[] {1, 2, 1, 0, -1}, new long[] {1, -1, 1, 0, 1});
  }
}
