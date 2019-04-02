package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059222 Minimal number of disjoint edge-paths into which the graph of the n-ary cube can be partitioned.
 * @author Sean A. Irvine
 */
public class A059222 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059222() {
    super(new long[] {-4, 0, 5, 0}, new long[] {1, 1, 4, 1});
  }
}
