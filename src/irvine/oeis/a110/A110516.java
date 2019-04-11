package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110516 Expansion of <code>(1-x+x^2+x^3)/(1+x-x^4-x^5)</code>.
 * @author Sean A. Irvine
 */
public class A110516 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110516() {
    super(new long[] {1, 1, 0, 0, -1}, new long[] {1, -2, 3, -2, 3});
  }
}
