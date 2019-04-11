package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266883 Numbers of the form m*(4*m+1)+1, where m <code>= 0,-1,1,-2,2,-3,3,..</code>.
 * @author Sean A. Irvine
 */
public class A266883 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266883() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 4, 6, 15, 19});
  }
}
