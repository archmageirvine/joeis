package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055357 Number of increasing mobiles (circular rooted trees) with n nodes and 3 leaves.
 * @author Sean A. Irvine
 */
public class A055357 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055357() {
    super(new long[] {-12, 52, -91, 82, -40, 10}, new long[] {2, 18, 98, 424, 1614, 5682});
  }
}
