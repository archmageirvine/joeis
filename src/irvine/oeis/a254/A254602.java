package irvine.oeis.a254;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A254602 Numbers of n-length words on alphabet {0..7} with no subwords ii, where i is from {0..2}.
 * @author Sean A. Irvine
 */
public class A254602 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254602() {
    super(new long[] {5, 7}, new long[] {1, 8});
  }
}
