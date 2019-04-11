package irvine.oeis.a234;

import irvine.oeis.LinearRecurrence;

/**
 * A234038 Smallest positive integer solution x of <code>9*x -</code> 2^n*y <code>= 1</code>.
 * @author Sean A. Irvine
 */
public class A234038 extends LinearRecurrence {

  /** Construct the sequence. */
  public A234038() {
    super(new long[] {-16, 24, -8, -2, 3}, new long[] {1, 1, 1, 1, 9});
  }
}
