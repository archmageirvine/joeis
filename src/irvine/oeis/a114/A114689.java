package irvine.oeis.a114;

import irvine.oeis.LinearRecurrence;

/**
 * A114689 Expansion of <code>(-1-4*x+x^2)/((1-x)*(x+1)*(x^2+2*x-1)); a Pellian-related</code> sequence.
 * @author Sean A. Irvine
 */
public class A114689 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114689() {
    super(new long[] {-1, -2, 2, 2}, new long[] {1, 6, 13, 36});
  }
}
