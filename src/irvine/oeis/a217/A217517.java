package irvine.oeis.a217;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A217517 Base-n state complexity of partitioned deterministic finite automaton (PDFA) for the periodic sequence (12345)*.
 * @author Sean A. Irvine
 */
public class A217517 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217517() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {20, 20, 10, 6, 5});
  }
}
