package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037551 Decimal expansion of a(n) is given by the first n terms of the periodic sequence with initial period 1,2,2.
 * @author Sean A. Irvine
 */
public class A037551 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037551() {
    super(new long[] {-10, 1, 0, 10}, new long[] {1, 12, 122, 1221});
  }
}
