package irvine.oeis.a119;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A119997 Sum of all matrix elements of n X n matrix M[i,j] = (-1)^(i+j)*Fibonacci[i+j-1].
 * @author Sean A. Irvine
 */
public class A119997 extends LinearRecurrence {

  /** Construct the sequence. */
  public A119997() {
    super(1, new long[] {-1, 5, -7, 1, 3}, new long[] {1, 1, 4, 5, 17});
  }
}
