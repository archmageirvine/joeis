package irvine.oeis.a070;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A070262 5th diagonal of triangle defined in A051537.
 * @author Sean A. Irvine
 */
public class A070262 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070262() {
    super(1, new long[] {1, 0, 0, 0, -3, 0, 0, 0, 3, 0, 0, 0}, new long[] {5, 3, 21, 2, 45, 15, 77, 6, 117, 35, 165, 12});
  }
}
