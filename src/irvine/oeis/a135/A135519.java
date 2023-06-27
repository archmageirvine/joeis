package irvine.oeis.a135;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A135519 Generalized repunits in base 14.
 * @author Sean A. Irvine
 */
public class A135519 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135519() {
    super(1, new long[] {-14, 15}, new long[] {1, 15});
  }
}
