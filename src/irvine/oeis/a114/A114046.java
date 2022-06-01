package irvine.oeis.a114;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A114046 Numbers x such that x^2 - 92*y^2 = 1 for some y.
 * @author Sean A. Irvine
 */
public class A114046 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114046() {
    super(new long[] {-1, 2302}, new long[] {1, 1151});
  }
}
