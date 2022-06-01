package irvine.oeis.a013;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A013982 Expansion of 1/(1-x^2-x^3-x^4-x^5).
 * @author Sean A. Irvine
 */
public class A013982 extends LinearRecurrence {

  /** Construct the sequence. */
  public A013982() {
    super(new long[] {1, 1, 1, 1, 0}, new long[] {1, 0, 1, 1, 2});
  }
}
