package irvine.oeis.a144;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A144468 Final digit of multiples of 7.
 * @author Sean A. Irvine
 */
public class A144468 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144468() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 7, 4, 1, 8, 5, 2, 9, 6, 3});
  }
}
