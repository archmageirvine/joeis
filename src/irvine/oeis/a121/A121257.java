package irvine.oeis.a121;

import irvine.oeis.LinearRecurrence;

/**
 * A121257 Number of conjugated cycles composed of six carbons in <code>(1,1)-nanotubes</code> in terms of the number of naphthalene units.
 * @author Sean A. Irvine
 */
public class A121257 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121257() {
    super(new long[] {-1, 6, -11, 6}, new long[] {4, 20, 76, 260});
  }
}
