package irvine.oeis.a185;

import irvine.oeis.LinearRecurrence;

/**
 * A185788 Sum of the first <code>k-1</code> numbers in the k-th column of the natural number array <code>A000027</code>, by antidiagonals.
 * @author Sean A. Irvine
 */
public class A185788 extends LinearRecurrence {

  /** Construct the sequence. */
  public A185788() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 2, 12, 37});
  }
}
