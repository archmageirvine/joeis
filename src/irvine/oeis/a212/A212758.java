package irvine.oeis.a212;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A212758 Number of (w,x,y,z) with all terms in {0,...,n} and w=[R/2], where R=max{w,x,y,z}-min{w,x,y,z} and [ ]=floor.
 * @author Sean A. Irvine
 */
public class A212758 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212758() {
    super(new long[] {-1, 1, 0, 3, -3, 0, -3, 3, 0, 1}, new long[] {1, 8, 20, 57, 118, 172, 299, 468, 594, 865});
  }
}
