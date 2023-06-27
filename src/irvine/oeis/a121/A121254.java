package irvine.oeis.a121;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A121254 Number of conjugated cycles composed of six carbons in (n,n)-nanotubes in terms of the number of naphthalene units.
 * @author Sean A. Irvine
 */
public class A121254 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121254() {
    super(1, new long[] {-1, 6, -11, 6}, new long[] {4, 16, 60, 208});
  }
}
