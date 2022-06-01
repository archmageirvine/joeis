package irvine.oeis.a173;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A173593 Numbers having in binary representation exactly two ones in three consecutive digits.
 * @author Sean A. Irvine
 */
public class A173593 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173593() {
    super(new long[] {-2, 0, 1, 2, 0}, new long[] {3, 5, 6, 11, 13});
  }
}
