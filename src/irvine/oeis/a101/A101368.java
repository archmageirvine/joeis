package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101368 The sequence solves the following problem: find all the pairs (i,j) such that i divides <code>1+j+j^2</code> and j divides 1+i+i^2. In fact, the pairs <code>(a(n),a(n+1)), n&gt;0,</code> are all the solutions.
 * @author Sean A. Irvine
 */
public class A101368 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101368() {
    super(new long[] {1, -6, 6}, new long[] {1, 1, 3});
  }
}
