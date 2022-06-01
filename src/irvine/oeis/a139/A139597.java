package irvine.oeis.a139;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A139597 A139278(n) followed by A139274(n+1).
 * @author Sean A. Irvine
 */
public class A139597 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139597() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 7, 15, 30});
  }
}
