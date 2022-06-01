package irvine.oeis.a131;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A131913 Product of the square matrix in A065941 and the column vector (1, 2, 3, ...)'.
 * @author Sean A. Irvine
 */
public class A131913 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131913() {
    super(new long[] {-1, -2, 1, 2}, new long[] {1, 3, 6, 13});
  }
}
