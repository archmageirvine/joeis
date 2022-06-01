package irvine.oeis.a244;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A244726 6*n^3.
 * @author Sean A. Irvine
 */
public class A244726 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244726() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 6, 48, 162});
  }
}
