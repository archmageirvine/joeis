package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247387 Base-n state complexity of partitioned deterministic finite automaton (PDFA) for the periodic sequence (1234567)*.
 * @author Sean A. Irvine
 */
public class A247387 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247387() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0}, new long[] {21, 42, 21, 42, 14, 8, 7});
  }
}
