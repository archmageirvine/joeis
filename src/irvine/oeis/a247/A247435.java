package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247435 Base-n state complexity of partitioned deterministic finite automaton (PDFA) for the periodic sequence <code>(123</code>....13)*.
 * @author Sean A. Irvine
 */
public class A247435 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247435() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {156, 39, 78, 52, 156, 156, 52, 39, 78, 156, 26, 14, 13});
  }
}
