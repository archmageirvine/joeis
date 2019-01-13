package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137788.
 * @author Sean A. Irvine
 */
public class A137788 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137788() {
    super(new long[] {720, -1044, 580, -155, 20}, new long[] {-8, -18, -8, 318, 3352});
  }
}
