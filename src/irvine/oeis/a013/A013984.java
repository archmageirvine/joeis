package irvine.oeis.a013;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A013984 Expansion of 1/(1-x^2-x^3-x^4-x^5-x^6-x^7).
 * @author Sean A. Irvine
 */
public class A013984 extends LinearRecurrence {

  /** Construct the sequence. */
  public A013984() {
    super(new long[] {1, 1, 1, 1, 1, 1, 0}, new long[] {1, 0, 1, 1, 2, 3, 5});
  }
}
