package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051943.
 * @author Sean A. Irvine
 */
public class A051943 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051943() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 10, 31, 64});
  }
}
