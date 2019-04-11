package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097138 Convolution of <code>4^n</code> and <code>floor(n/2)</code>.
 * @author Sean A. Irvine
 */
public class A097138 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097138() {
    super(new long[] {4, -5, -3, 5}, new long[] {0, 0, 1, 5});
  }
}
