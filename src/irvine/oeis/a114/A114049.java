package irvine.oeis.a114;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A114049 x such that x^2 - 21*y^2 = 1.
 * @author Sean A. Irvine
 */
public class A114049 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114049() {
    super(new long[] {-1, 110}, new long[] {1, 55});
  }
}
