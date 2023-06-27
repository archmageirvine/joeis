package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037575 Decimal expansion of a(n) is given by the first n terms of the periodic sequence with initial period 2,1,2.
 * @author Sean A. Irvine
 */
public class A037575 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037575() {
    super(1, new long[] {-10, 1, 0, 10}, new long[] {2, 21, 212, 2122});
  }
}
