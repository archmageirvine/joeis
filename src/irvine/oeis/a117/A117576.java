package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117576 Expansion of <code>(1-x^3)/((1-x^2)(1+2x^2))</code>.
 * @author Sean A. Irvine
 */
public class A117576 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117576() {
    super(new long[] {-2, -2, -1}, new long[] {1, 0, -1});
  }
}
