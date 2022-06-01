package irvine.oeis.a106;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A106354 Number of compositions of n into 5 parts such that no two adjacent parts are equal.
 * @author Sean A. Irvine
 */
public class A106354 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106354() {
    super(new long[] {1, -1, -1, 0, 0, 1, 1, 1, -1, -1, -1, 0, 0, 1, 1}, new long[] {1, 3, 15, 30, 68, 119, 204, 316, 489, 696, 987, 1340, 1801, 2348, 3035});
  }
}
