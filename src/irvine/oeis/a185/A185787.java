package irvine.oeis.a185;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A185787 Sum of first k numbers in column k of the natural number array A000027; by antidiagonals.
 * @author Sean A. Irvine
 */
public class A185787 extends LinearRecurrence {

  /** Construct the sequence. */
  public A185787() {
    super(1, new long[] {-1, 4, -6, 4}, new long[] {1, 7, 25, 62});
  }
}
