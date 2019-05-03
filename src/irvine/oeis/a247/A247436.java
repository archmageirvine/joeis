package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247436 Base-n state complexity of partitioned deterministic finite automaton (PDFA) for the periodic sequence <code>(123...14)*</code>.
 * @author Sean A. Irvine
 */
public class A247436 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247436() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {43, 84, 43, 84, 29, 15, 15, 42, 85, 42, 85, 28, 15, 14});
  }
}
