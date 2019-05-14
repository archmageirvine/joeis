package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022154 Coordination sequence for root lattice <code>B_12</code>.
 * @author Sean A. Irvine
 */
public class A022154 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022154() {
    super(new long[] {-1, 12, -66, 220, -495, 792, -924, 792, -495, 220, -66, 12},
      new long[] {288, 15776, 346304, 4254912, 34792672, 210482016, 1010803584, 4047994752L, 14009305760L, 43023042336L, 119628650560L, 305908697152L},
      1);
  }
}
