package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017892 Expansion of <code>1/(1 - x^10 - x^11 - x^12 - x^13 - x^14 - x^15 - x^16)</code>.
 * @author Sean A. Irvine
 */
public class A017892 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017892() {
    super(new long[] {1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1});
  }
}
