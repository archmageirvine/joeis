package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097121 Expansion of <code>(1-x)^2/((1-x)^3-4x^4)</code>.
 * @author Sean A. Irvine
 */
public class A097121 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097121() {
    super(new long[] {4, 1, -3, 3}, new long[] {1, 1, 1, 1});
  }
}
