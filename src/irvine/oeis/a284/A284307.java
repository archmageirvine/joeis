package irvine.oeis.a284;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A284307 Permutation of the natural numbers partitioned into quadruples [4k-3, 4k, 4k-2, 4k-1], k &gt; 0.
 * @author Sean A. Irvine
 */
public class A284307 extends LinearRecurrence {

  /** Construct the sequence. */
  public A284307() {
    super(1, new long[] {-1, 1, 0, 0, 1}, new long[] {1, 4, 2, 3, 5});
  }
}
