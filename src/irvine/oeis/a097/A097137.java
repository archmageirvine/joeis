package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097137 Convolution of <code>3^n</code> and <code>floor(n/2)</code>.
 * @author Sean A. Irvine
 */
public class A097137 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097137() {
    super(new long[] {3, -4, -2, 4}, new long[] {0, 0, 1, 4});
  }
}
