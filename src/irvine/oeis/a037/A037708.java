package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037708 Decimal expansion of a(n) is given by the first n terms of the periodic sequence with initial period 1,3,0,2.
 * @author Sean A. Irvine
 */
public class A037708 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037708() {
    super(1, new long[] {-10, 1, 0, 0, 10}, new long[] {1, 13, 130, 1302, 13021});
  }
}
