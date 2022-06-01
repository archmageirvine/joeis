package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081915 a(n) = 4^n*(n^3 - 3n^2 + 2n + 384)/384.
 * @author Sean A. Irvine
 */
public class A081915 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081915() {
    super(new long[] {-256, 256, -96, 16}, new long[] {1, 4, 16, 65});
  }
}
