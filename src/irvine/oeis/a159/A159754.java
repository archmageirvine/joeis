package irvine.oeis.a159;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A159754 Numbers n with property that n^2 ends with 81.
 * @author Sean A. Irvine
 */
public class A159754 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159754() {
    super(new long[] {-1, 1, 1}, new long[] {9, 41, 59});
  }
}
