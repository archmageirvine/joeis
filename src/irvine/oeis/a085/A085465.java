package irvine.oeis.a085;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A085465 Number of monotone n-weightings of complete bipartite digraph K(3,3).
 * @author Sean A. Irvine
 */
public class A085465 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085465() {
    super(1, new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 15, 102, 442, 1443, 3885, 9100});
  }
}
