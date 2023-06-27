package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037694 Decimal expansion of a(n) is given by the first n terms of the periodic sequence with initial period 1,2,0,3.
 * @author Sean A. Irvine
 */
public class A037694 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037694() {
    super(1, new long[] {-10, 1, 0, 0, 10}, new long[] {1, 12, 120, 1203, 12031});
  }
}
