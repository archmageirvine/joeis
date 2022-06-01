package irvine.oeis.a291;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A291772 Number of minimal dominating sets in the 2n-crossed prism graph.
 * @author Sean A. Irvine
 */
public class A291772 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291772() {
    super(new long[] {2, 17, 7, -2, 4}, new long[] {4, 12, 61, 316, 1304});
  }
}
