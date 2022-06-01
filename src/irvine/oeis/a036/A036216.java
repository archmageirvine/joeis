package irvine.oeis.a036;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A036216 Expansion of 1/(1 - 3*x)^4; 4-fold convolution of A000244 (powers of 3).
 * @author Sean A. Irvine
 */
public class A036216 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036216() {
    super(new long[] {-81, 108, -54, 12}, new long[] {1, 12, 90, 540});
  }
}
