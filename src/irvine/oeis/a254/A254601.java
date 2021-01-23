package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254601 Numbers of n-length words on alphabet {0,1,...,6} with no subwords ii, where i is from {0,1,2}.
 * @author Sean A. Irvine
 */
public class A254601 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254601() {
    super(new long[] {4, 6}, new long[] {1, 7});
  }
}
