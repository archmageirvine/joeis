package irvine.oeis.a102;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A102517 Expansion of (1+x^2)/((1-x+x^2)(1+2x^2)).
 * @author Sean A. Irvine
 */
public class A102517 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102517() {
    super(new long[] {-2, 2, -3, 1}, new long[] {1, 1, -1, -2});
  }
}
