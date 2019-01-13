package irvine.oeis.a160;

import irvine.oeis.LinearRecurrence;

/**
 * A160837.
 * @author Sean A. Irvine
 */
public class A160837 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160837() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 45, 556, 3457, 14317, 45565, 120772});
  }
}
