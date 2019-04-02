package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247391 Base-n state complexity of partitioned deterministic finite automaton (PDFA) for the periodic sequence (1234567891011).
 * @author Sean A. Irvine
 */
public class A247391 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247391() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {110, 55, 55, 55, 110, 110, 110, 55, 22, 12, 11});
  }
}
