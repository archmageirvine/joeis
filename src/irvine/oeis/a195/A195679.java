package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195679 Order of n-th homotopy group of the topological group O(oo), with -1 if the homotopy group is Z.
 * @author Sean A. Irvine
 */
public class A195679 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195679() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0}, new long[] {2, 2, 1, -1, 1, 1, 1, -1});
  }
}
