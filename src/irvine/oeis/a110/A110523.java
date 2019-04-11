package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110523 Expansion of <code>(1 + x)/(1 + x + 3*x^2)</code>.
 * @author Sean A. Irvine
 */
public class A110523 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110523() {
    super(new long[] {-3, -1}, new long[] {1, 0});
  }
}
