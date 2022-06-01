package irvine.oeis.a270;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A270879 Expansion of (x+4*x^4)/(1-x-x^2-x^4-2*x^5-x^8).
 * @author Sean A. Irvine
 */
public class A270879 extends LinearRecurrence {

  /** Construct the sequence. */
  public A270879() {
    super(new long[] {1, 0, 0, 2, 1, 0, 1, 1}, new long[] {0, 1, 1, 2, 7, 10, 20, 34});
  }
}
