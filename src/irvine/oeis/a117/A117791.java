package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117791 Expansion of 1/(1 - x - x^2 + x^4 - x^6).
 * @author Sean A. Irvine
 */
public class A117791 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117791() {
    super(new long[] {1, 0, -1, 0, 1, 1}, new long[] {1, 1, 2, 3, 4, 6});
  }
}
