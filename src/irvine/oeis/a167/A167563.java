package irvine.oeis.a167;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A167563 The sixth row of the ED2 array A167560.
 * @author Sean A. Irvine
 */
public class A167563 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167563() {
    super(1, new long[] {-1, 6, -15, 20, -15, 6}, new long[] {720, 3360, 10752, 27648, 61440, 122880});
  }
}
