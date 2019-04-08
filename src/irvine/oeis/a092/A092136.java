package irvine.oeis.a092;

import irvine.oeis.LinearRecurrence;

/**
 * Number of spanning trees in S_5 x P_n.
 * @author Sean A. Irvine
 */
public class A092136 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092136() {
    super(new long[] {-1, 144, -2640, 6930, -2640, 144}, new long[] {1, 189, 24576, 3046869, 375175625, 46151368704L});
  }
}
