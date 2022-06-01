package irvine.oeis.a287;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A287425 Number of maximal matchings in the n-gear graph.
 * @author Sean A. Irvine
 */
public class A287425 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287425() {
    super(new long[] {1, -3, 7, -11, 12, -10, 5}, new long[] {3, 6, 11, 22, 47, 98, 198});
  }
}
