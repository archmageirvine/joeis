package irvine.oeis.a287;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A287082 Number of edge covers on the n-web graph.
 * @author Sean A. Irvine
 */
public class A287082 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287082() {
    super(new long[] {8, 6}, new long[] {6, 52});
  }
}
