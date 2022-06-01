package irvine.oeis.a287;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A287327 Number of independent vertex sets (and vertex covers) in the 2n-crossed prism graph.
 * @author Sean A. Irvine
 */
public class A287327 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287327() {
    super(new long[] {-7, 7}, new long[] {2, 7});
  }
}
