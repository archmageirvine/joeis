package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213031.
 * @author Sean A. Irvine
 */
public class A213031 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213031() {
    super(new long[] {-1, -2, 0, 5, 7, 0, -9, -9, 0, 7, 5, 0, -2}, new long[] {0, 0, 1, 0, 7, 7, 19, 19, 56, 37, 98, 98, 152});
  }
}
