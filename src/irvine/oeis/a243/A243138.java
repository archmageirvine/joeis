package irvine.oeis.a243;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A243138 n^2 + 15*n + 13.
 * @author Sean A. Irvine
 */
public class A243138 extends LinearRecurrence {

  /** Construct the sequence. */
  public A243138() {
    super(new long[] {1, -3, 3}, new long[] {13, 29, 47});
  }
}
