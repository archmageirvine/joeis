package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090948.
 * @author Sean A. Irvine
 */
public class A090948 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090948() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 159, 518, 1198, 2358, 4200});
  }
}
