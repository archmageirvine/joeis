package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212744 Number of (w,x,y,z) with all terms in {0,...,n} and w=max{w,x,y,z}-min{w,x,y,z}; i.e., the range of (w,x,y,z) is its first term.
 * @author Sean A. Irvine
 */
public class A212744 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212744() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {1, 8, 34, 83, 181, 314, 532});
  }
}
