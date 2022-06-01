package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168122 n^2*(n^4+1)/2.
 * @author Sean A. Irvine
 */
public class A168122 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168122() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 1, 34, 369, 2056, 7825, 23346});
  }
}
