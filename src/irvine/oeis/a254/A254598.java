package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254598 Numbers of n-length words on alphabet {0,1,...,8} with no subwords ii, for i from {0,1}.
 * @author Sean A. Irvine
 */
public class A254598 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254598() {
    super(new long[] {7, 8}, new long[] {1, 9});
  }
}
