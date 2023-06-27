package irvine.oeis.a167;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A167561 The fourth row of the ED2 array A167560.
 * @author Sean A. Irvine
 */
public class A167561 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167561() {
    super(1, new long[] {-1, 4, -6, 4}, new long[] {24, 80, 192, 384});
  }
}
