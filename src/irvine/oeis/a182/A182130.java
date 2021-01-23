package irvine.oeis.a182;

import irvine.oeis.LinearRecurrence;

/**
 * A182130 Number of independent sets of nodes in the  armchair (3,3) carbon nanotube graph of breadth n (n&gt;=1).
 * @author Sean A. Irvine
 */
public class A182130 extends LinearRecurrence {

  /** Construct the sequence. */
  public A182130() {
    super(new long[] {28, 42, -109, 17, 13}, new long[] {27, 322, 4556, 61814, 847098});
  }
}
