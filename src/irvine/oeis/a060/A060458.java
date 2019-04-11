package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060458 Maximal value seen in the final n decimal digits of <code>2^j</code> for all values of j.
 * @author Sean A. Irvine
 */
public class A060458 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060458() {
    super(new long[] {-20, 12}, new long[] {8, 96});
  }
}
