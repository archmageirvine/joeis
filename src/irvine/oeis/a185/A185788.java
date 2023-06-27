package irvine.oeis.a185;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A185788 Sum of the first k-1 numbers in the k-th column of the natural number array A000027, by antidiagonals.
 * @author Sean A. Irvine
 */
public class A185788 extends LinearRecurrence {

  /** Construct the sequence. */
  public A185788() {
    super(1, new long[] {-1, 4, -6, 4}, new long[] {0, 2, 12, 37});
  }
}
