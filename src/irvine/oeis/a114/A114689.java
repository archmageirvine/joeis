package irvine.oeis.a114;

import irvine.oeis.LinearRecurrence;

/**
 * A114689 Expansion of (1 +4*x -x^2)/((1-x^2)*(1-2*x-x^2)); a Pellian-related sequence.
 * @author Sean A. Irvine
 */
public class A114689 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114689() {
    super(new long[] {-1, -2, 2, 2}, new long[] {1, 6, 13, 36});
  }
}
