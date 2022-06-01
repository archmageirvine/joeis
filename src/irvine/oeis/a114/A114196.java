package irvine.oeis.a114;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A114196 Expansion of (1-3x)/(1-6x+8x^2+x^3).
 * @author Sean A. Irvine
 */
public class A114196 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114196() {
    super(new long[] {-1, -8, 6}, new long[] {1, 3, 10});
  }
}
