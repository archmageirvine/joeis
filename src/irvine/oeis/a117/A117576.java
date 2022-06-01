package irvine.oeis.a117;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A117576 Expansion of (1-x^3)/((1-x^2)(1+2x^2)).
 * @author Sean A. Irvine
 */
public class A117576 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117576() {
    super(new long[] {-2, -2, -1}, new long[] {1, 0, -1});
  }
}
