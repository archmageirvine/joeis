package irvine.oeis.a102;

import irvine.oeis.LinearRecurrence;

/**
 * A102785 G.f.: <code>(x-1)/(-2*x^2 + 3*x^3 + 2*x - 1)</code>.
 * @author Sean A. Irvine
 */
public class A102785 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102785() {
    super(new long[] {3, -2, 2}, new long[] {1, 1, 0});
  }
}
