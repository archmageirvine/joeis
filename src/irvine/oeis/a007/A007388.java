package irvine.oeis.a007;

import irvine.oeis.LinearRecurrence;

/**
 * A007388 5th-order maximal independent sets in cycle graph.
 * @author Sean A. Irvine
 */
public class A007388 extends LinearRecurrence {

  /** Construct the sequence. */
  public A007388() {
    super(new long[] {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0}, new long[] {0, 2, 3, 2, 5, 2, 7, 2, 9, 2, 11, 2});
  }
}

