package irvine.oeis.a219;

import irvine.oeis.LinearRecurrence;

/**
 * A219190 Numbers of the form <code>n*(5*n+1),</code> where <code>n = 0,-1,1,-2,2,-3,3,</code>...
 * @author Sean A. Irvine
 */
public class A219190 extends LinearRecurrence {

  /** Construct the sequence. */
  public A219190() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 4, 6, 18, 22});
  }
}
