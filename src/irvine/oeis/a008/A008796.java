package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008796 Molien series for 3-dimensional group <code>[2,3]+ = 223</code>; also for group H_{1,2} of order 384.
 * @author Sean A. Irvine
 */
public class A008796 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008796() {
    super(new long[] {1, 0, 0, 0, 1}, new int[] {2, 2, 3});
  }
}

