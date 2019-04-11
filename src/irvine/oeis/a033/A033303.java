package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033303 Expansion of <code>(1 + x)/(1 - 2*x - x^2 + x^3)</code>.
 * @author Sean A. Irvine
 */
public class A033303 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033303() {
    super(new long[] {-1, 1, 2}, new long[] {1, 3, 7});
  }
}
