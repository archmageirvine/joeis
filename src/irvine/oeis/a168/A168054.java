package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168054 Expansion of (1-8x^2-24x^3)/((1-2x)^2*(1+2x+4x^2)).
 * @author Sean A. Irvine
 */
public class A168054 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168054() {
    super(new long[] {-16, 8, 0, 2}, new long[] {1, 2, -4, -24});
  }
}
