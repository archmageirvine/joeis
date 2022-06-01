package irvine.oeis.a161;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A161462 Final digit of the sum of all the integers from n to 2*n-1.
 * @author Sean A. Irvine
 */
public class A161462 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161462() {
    super(new long[] {1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 1, 0, 0, 0, 0}, new long[] {1, 5, 2, 2, 5, 1, 0, 2, 7, 5, 6, 0, 7, 7, 0});
  }
}
