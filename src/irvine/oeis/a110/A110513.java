package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110513 Expansion of <code>(1 + x)/(1 + 2x + x^3)</code>.
 * @author Sean A. Irvine
 */
public class A110513 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110513() {
    super(new long[] {-1, 0, -2}, new long[] {1, -1, 2});
  }
}
