package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056074 Number of 3-element ordered antichain covers of <code>an</code> unlabeled n-element set.
 * @author Sean A. Irvine
 */
public class A056074 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056074() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {2, 17, 71, 212, 518, 1106, 2142});
  }
}
