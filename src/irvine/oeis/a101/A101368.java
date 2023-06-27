package irvine.oeis.a101;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A101368 The sequence solves the following problem: find all the pairs (i,j) such that i divides 1+j+j^2 and j divides 1+i+i^2. In fact, the pairs (a(n),a(n+1)), n&gt;0, are all the solutions.
 * @author Sean A. Irvine
 */
public class A101368 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101368() {
    super(1, new long[] {1, -6, 6}, new long[] {1, 1, 3});
  }
}
