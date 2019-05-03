package irvine.oeis.a185;

import irvine.oeis.LinearRecurrence;

/**
 * A185787 Sum of first k numbers in column k of the natural number array <code>A000027</code>; by antidiagonals.
 * @author Sean A. Irvine
 */
public class A185787 extends LinearRecurrence {

  /** Construct the sequence. */
  public A185787() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 7, 25, 62});
  }
}
