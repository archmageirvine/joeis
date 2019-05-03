package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048921 9-gonal heptagonal numbers <code>(A000566)</code>.
 * @author Sean A. Irvine
 */
public class A048921 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048921() {
    super(new long[] {1, -20163, 20163}, new long[] {1, 26884, 542041975});
  }
}
