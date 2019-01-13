package irvine.oeis.a260;

import irvine.oeis.LinearRecurrence;

/**
 * A260505.
 * @author Sean A. Irvine
 */
public class A260505 extends LinearRecurrence {

  /** Construct the sequence. */
  public A260505() {
    super(new long[] {-1, -2, 3, 2, -10, 6, 11, -18, 6, 10, -13, 6}, new long[] {0, 0, 0, 0, 0, 1, 2, 7, 16, 38, 82, 175});
  }
}
