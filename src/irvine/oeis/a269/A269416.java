package irvine.oeis.a269;

import irvine.oeis.LinearRecurrence;

/**
 * A269416 Expansion of 3*(2 - x)/((1 - x)*(1 + x)^2).
 * @author Sean A. Irvine
 */
public class A269416 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269416() {
    super(new long[] {1, 1, -1}, new long[] {6, -9, 15});
  }
}
