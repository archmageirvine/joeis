package irvine.oeis.a045;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A045809 9-ish numbers (end in 13, 37, 59, 91).
 * @author Sean A. Irvine
 */
public class A045809 extends LinearRecurrence {

  /** Construct the sequence. */
  public A045809() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {13, 37, 59, 91, 113});
  }
}
