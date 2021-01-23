package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081143 5th binomial transform of (0,0,0,1,0,0,0,0,......).
 * @author Sean A. Irvine
 */
public class A081143 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081143() {
    super(new long[] {-625, 500, -150, 20}, new long[] {0, 0, 0, 1});
  }
}
