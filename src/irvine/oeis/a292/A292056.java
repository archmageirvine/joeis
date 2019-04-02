package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292056 Wiener index of the n-Keller graph.
 * @author Sean A. Irvine
 */
public class A292056 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292056() {
    super(new long[] {-3072, 1984, -432, 36}, new long[] {12, 200, 2944, 43392});
  }
}
