package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081144 Starting at 1, four-fold convolution of A000400 (powers of 6).
 * @author Sean A. Irvine
 */
public class A081144 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081144() {
    super(new long[] {-1296, 864, -216, 24}, new long[] {0, 0, 0, 1});
  }
}
