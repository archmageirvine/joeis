package irvine.oeis.a200;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A200442 Expansion of 1/(1-31*x+x^2).
 * @author Sean A. Irvine
 */
public class A200442 extends LinearRecurrence {

  /** Construct the sequence. */
  public A200442() {
    super(new long[] {-1, 31}, new long[] {1, 31});
  }
}
