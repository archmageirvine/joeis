package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022151 Coordination sequence for root lattice <code>B_9</code>.
 * @author Sean A. Irvine
 */
public class A022151 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022151() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {162, 5154, 67266, 507906, 2653346, 10666146, 35310402, 100746498, 255708578}, 1);
  }
}
