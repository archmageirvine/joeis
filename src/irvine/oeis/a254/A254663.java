package irvine.oeis.a254;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A254663 Numbers of n-length words on alphabet {0,1,...,7} with no subwords ii, where i is from {0,1,...,5}.
 * @author Sean A. Irvine
 */
public class A254663 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254663() {
    super(new long[] {2, 7}, new long[] {1, 8});
  }
}
