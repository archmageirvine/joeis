package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157788 1482401250n^2 - 830253600n + 116250751.
 * @author Sean A. Irvine
 */
public class A157788 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157788() {
    super(new long[] {1, -3, 3}, new long[] {768398401, 4385348551L, 10967101201L});
  }
}
