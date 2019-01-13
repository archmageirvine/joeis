package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021774.
 * @author Sean A. Irvine
 */
public class A021774 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021774() {
    super(new long[] {-200, 310, -129, 20}, new long[] {1, 20, 271, 3150});
  }
}
