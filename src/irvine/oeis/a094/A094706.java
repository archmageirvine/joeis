package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094706 Convolution of <code>Pell(n)</code> and <code>2^n</code>.
 * @author Sean A. Irvine
 */
public class A094706 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094706() {
    super(new long[] {-2, -3, 4}, new long[] {0, 1, 4});
  }
}
