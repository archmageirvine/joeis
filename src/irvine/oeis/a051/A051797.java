package irvine.oeis.a051;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A051797 Partial sums of A007585.
 * @author Sean A. Irvine
 */
public class A051797 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051797() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 12, 50, 140, 315});
  }
}
