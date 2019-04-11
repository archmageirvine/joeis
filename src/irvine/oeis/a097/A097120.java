package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097120 Expansion of <code>(1-x)^2/((1-x)^3-3x^4)</code>.
 * @author Sean A. Irvine
 */
public class A097120 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097120() {
    super(new long[] {3, 1, -3, 3}, new long[] {1, 1, 1, 1});
  }
}
