package irvine.oeis.a293;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A293126 Number of matchings in the 2n-crossed prism graph.
 * @author Sean A. Irvine
 */
public class A293126 extends LinearRecurrence {

  /** Construct the sequence. */
  public A293126() {
    super(new long[] {4, -18, 12}, new long[] {3, 12, 108});
  }
}
