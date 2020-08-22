package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290926 p-INVERT of the positive integers, where p(S) = (1 - S^2)^2.
 * @author Sean A. Irvine
 */
public class A290926 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290926() {
    super(new long[] {-1, 8, -26, 48, -59, 48, -26, 8}, new long[] {0, 2, 8, 23, 64, 182, 520, 1475});
  }
}
