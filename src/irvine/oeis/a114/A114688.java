package irvine.oeis.a114;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A114688 Expansion of (1 +3*x -x^2)/((1-x^2)*(1-2*x-x^2)); a Pellian-related sequence.
 * @author Sean A. Irvine
 */
public class A114688 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114688() {
    super(new long[] {-1, -2, 2, 2}, new long[] {1, 5, 11, 30});
  }
}
