package irvine.oeis.a209;

import irvine.oeis.LinearRecurrence;

/**
 * A209267.
 * @author Sean A. Irvine
 */
public class A209267 extends LinearRecurrence {

  /** Construct the sequence. */
  public A209267() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 36, 3585, 73810, 669921, 3784176, 15721201, 52683870, 150652545});
  }
}
