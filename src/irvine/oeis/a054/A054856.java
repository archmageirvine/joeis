package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054856.
 * @author Sean A. Irvine
 */
public class A054856 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054856() {
    super(new long[] {-1, -1, 0, 3, 2}, new long[] {1, 1, 5, 13, 40});
  }
}
