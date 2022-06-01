package irvine.oeis.a167;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A167574 The fourth row of the ED3 array A167572.
 * @author Sean A. Irvine
 */
public class A167574 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167574() {
    super(new long[] {-1, 4, -6, 4}, new long[] {167, 741, 2043, 4409});
  }
}
