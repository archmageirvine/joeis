package irvine.oeis.a202;

import irvine.oeis.LinearRecurrence;

/**
 * A202156 y-values in the solution to x^2 - 13*y^2 = -1.
 * @author Sean A. Irvine
 */
public class A202156 extends LinearRecurrence {

  /** Construct the sequence. */
  public A202156() {
    super(new long[] {-1, 1298}, new long[] {5, 6485});
  }
}
