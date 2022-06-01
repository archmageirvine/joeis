package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037715 Decimal expansion of a(n) is given by the first n terms of the periodic sequence with initial period 1,3,2,0.
 * @author Sean A. Irvine
 */
public class A037715 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037715() {
    super(new long[] {-10, 11, -11, 11}, new long[] {1, 13, 132, 1320});
  }
}
