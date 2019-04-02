package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139672 Convolution of A008619 and A001400.
 * @author Sean A. Irvine
 */
public class A139672 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139672() {
    super(new long[] {-1, 2, 1, -3, 0, -1, 2, 2, -1, 0, -3, 1, 2}, new long[] {1, 2, 5, 9, 17, 27, 44, 65, 97, 136, 191, 257, 346});
  }
}
