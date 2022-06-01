package irvine.oeis.a108;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A108413 Expansion of (1+x+5x^2+2x^3) / (1-4x^2+x^4).
 * @author Sean A. Irvine
 */
public class A108413 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108413() {
    super(new long[] {-1, 0, -4, 0}, new long[] {1, 1, 1, -2});
  }
}
