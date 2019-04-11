package irvine.oeis.a102;

import irvine.oeis.LinearRecurrence;

/**
 * A102517 Expansion of <code>(1+x^2)/((1-x+x^2)(1+2x^2))</code>.
 * @author Sean A. Irvine
 */
public class A102517 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102517() {
    super(new long[] {-2, 2, -3, 1}, new long[] {1, 1, -1, -2});
  }
}
