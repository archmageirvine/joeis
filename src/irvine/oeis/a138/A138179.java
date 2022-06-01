package irvine.oeis.a138;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A138179 Wiener index of the prism graph Y_n on 2n nodes.
 * @author Sean A. Irvine
 */
public class A138179 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138179() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {1, 8, 21, 48, 85, 144});
  }
}
