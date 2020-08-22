package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094706 Convolution of Pell(n) and 2^n.
 * @author Sean A. Irvine
 */
public class A094706 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094706() {
    super(new long[] {-2, -3, 4}, new long[] {0, 1, 4});
  }
}
