package irvine.oeis.a108;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A108196 Expansion of (x-1)*(x+1) / (8*x^2 + 1 - 3*x + x^4 - 3*x^3).
 * @author Sean A. Irvine
 */
public class A108196 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108196() {
    super(new long[] {-1, 3, -8, 3}, new long[] {-1, -3, 0, 21});
  }
}
