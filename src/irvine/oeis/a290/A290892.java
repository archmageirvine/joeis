package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290892 p-INVERT of the positive integers, where p(S) = 1 - S^4.
 * @author Sean A. Irvine
 */
public class A290892 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290892() {
    super(new long[] {-1, 8, -28, 56, -69, 56, -28, 8}, new long[] {0, 0, 0, 1, 8, 36, 120, 331});
  }
}
