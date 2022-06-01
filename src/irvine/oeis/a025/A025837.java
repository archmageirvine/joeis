package irvine.oeis.a025;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A025837 Expansion of 1/((1-x^3)*(1-x^5)*(1-x^9)).
 * @author Sean A. Irvine
 */
public class A025837 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025837() {
    super(new long[] {1, 0, 0, -1, 0, -1, 0, 0, 1, -1, 0, 0, 1, 0, 1, 0, 0}, new long[] {1, 0, 0, 1, 0, 1, 1, 0, 1, 2, 1, 1, 2, 1, 2, 3, 1});
  }
}
