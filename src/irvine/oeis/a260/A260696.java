package irvine.oeis.a260;

import irvine.oeis.LinearRecurrence;

/**
 * A260696 The number of length-n permutations avoiding the patterns 1234, 1324, 1432 and 3214.
 * @author Sean A. Irvine
 */
public class A260696 extends LinearRecurrence {

  /** Construct the sequence. */
  public A260696() {
    super(new long[] {-7, -14, -15, 0, 8, 4, 2, 1, 2}, new long[] {1, 1, 2, 6, 20, 62, 172, 471, 1337});
  }
}
