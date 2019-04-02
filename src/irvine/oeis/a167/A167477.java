package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167477 Expansion of (1-3x+5x^2-x^3)/(1-3x+x^2)^2.
 * @author Sean A. Irvine
 */
public class A167477 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167477() {
    super(new long[] {-1, 6, -11, 6}, new long[] {1, 3, 12, 44});
  }
}
