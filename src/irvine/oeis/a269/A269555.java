package irvine.oeis.a269;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A269555 Expansion of (x^2 + 254*x - 7)/(x^3 - 99*x^2 + 99*x - 1).
 * @author Sean A. Irvine
 */
public class A269555 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269555() {
    super(new long[] {1, -99, 99}, new long[] {7, 439, 42767});
  }
}
