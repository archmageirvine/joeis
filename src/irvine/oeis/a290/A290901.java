package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290901 p-INVERT of the positive integers, where <code>p(S) = 1 - S^3 - S^4</code>.
 * @author Sean A. Irvine
 */
public class A290901 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290901() {
    super(new long[] {-1, 8, -28, 57, -71, 57, -28, 8}, new long[] {0, 0, 1, 7, 29, 93, 260, 689});
  }
}
