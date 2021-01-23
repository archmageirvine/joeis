package irvine.oeis.a114;

import irvine.oeis.LinearRecurrence;

/**
 * A114285 Expansion of (1-3*x)/((1-x)*(1-x^2)).
 * @author Sean A. Irvine
 */
public class A114285 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114285() {
    super(new long[] {-1, 1, 1}, new long[] {1, -2, -1});
  }
}
