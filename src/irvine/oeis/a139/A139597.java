package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139597.
 * @author Sean A. Irvine
 */
public class A139597 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139597() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 7, 15, 30});
  }
}
