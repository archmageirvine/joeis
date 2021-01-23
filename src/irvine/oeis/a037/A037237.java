package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037237 Expansion of (3 + x^2) / (1 - x)^4.
 * @author Sean A. Irvine
 */
public class A037237 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037237() {
    super(new long[] {-1, 4, -6, 4}, new long[] {3, 12, 31, 64});
  }
}
