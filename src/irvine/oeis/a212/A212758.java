package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212758.
 * @author Sean A. Irvine
 */
public class A212758 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212758() {
    super(new long[] {-1, 1, 0, 3, -3, 0, -3, 3, 0, 1}, new long[] {1, 8, 20, 57, 118, 172, 299, 468, 594, 865});
  }
}
