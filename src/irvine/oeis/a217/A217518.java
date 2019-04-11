package irvine.oeis.a217;

import irvine.oeis.LinearRecurrence;

/**
 * A217518 Base-n state complexity of partitioned deterministic finite automaton (PDFA) for the periodic sequence <code>(123456)*</code>.
 * @author Sean A. Irvine
 */
public class A217518 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217518() {
    super(new long[] {1, 0, 0, 0, 0, 0}, new long[] {13, 7, 7, 12, 7, 6});
  }
}
