package irvine.oeis.a165;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A165259 Sum of odd powers of 4 and 9 divided by 13.
 * @author Sean A. Irvine
 */
public class A165259 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165259() {
    super(new long[] {-1296, 97}, new long[] {1, 61});
  }
}
