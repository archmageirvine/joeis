package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164577 Integer averages of the first perfect cubes up to some n^3.
 * @author Sean A. Irvine
 */
public class A164577 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164577() {
    super(new long[] {-1, 1, 0, 3, -3, 0, -3, 3, 0, 1}, new long[] {1, 12, 25, 45, 112, 162, 225, 396, 507, 637});
  }
}
