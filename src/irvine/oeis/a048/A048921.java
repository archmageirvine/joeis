package irvine.oeis.a048;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A048921 9-gonal heptagonal numbers (A000566).
 * @author Sean A. Irvine
 */
public class A048921 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048921() {
    super(1, new long[] {1, -20163, 20163}, new long[] {1, 26884, 542041975});
  }
}
