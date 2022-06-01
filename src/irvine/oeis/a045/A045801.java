package irvine.oeis.a045;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A045801 1-ish numbers (end in 11, 39, 73, 77).
 * @author Sean A. Irvine
 */
public class A045801 extends LinearRecurrence {

  /** Construct the sequence. */
  public A045801() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {11, 39, 73, 77, 111});
  }
}
