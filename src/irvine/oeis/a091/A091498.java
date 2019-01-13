package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091498.
 * @author Sean A. Irvine
 */
public class A091498 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091498() {
    super(new long[] {-1, 1, 1, 0, 0, -1, 0, -2, 0, 1, 1, 1, 1, 0, -2, 0, -1, 0, 0, 1, 1}, new long[] {1, 2, 3, 5, 8, 11, 17, 23, 31, 41, 54, 68, 88, 109, 135, 165, 202, 241, 291, 344, 407});
  }
}
