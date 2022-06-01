package irvine.oeis.a172;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A172051 Decimal expansion of 1/999999.
 * @author Sean A. Irvine
 */
public class A172051 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172051() {
    super(new long[] {1, 0, 0, 0, 0, 0}, new long[] {0, 0, 0, 0, 0, 1});
  }
}
