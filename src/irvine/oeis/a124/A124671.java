package irvine.oeis.a124;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A124671 Row sums of A126277 = binomial transform of (1, 2, 2, 3, 4, 4, 4, ...).
 * @author Sean A. Irvine
 */
public class A124671 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124671() {
    super(1, new long[] {2, -9, 16, -14, 6}, new long[] {1, 3, 7, 16, 37});
  }
}
