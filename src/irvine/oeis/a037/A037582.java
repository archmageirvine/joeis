package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037582 Decimal expansion of a(n) is given by the first n terms of the periodic sequence with initial period 1,3.
 * @author Sean A. Irvine
 */
public class A037582 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037582() {
    super(new long[] {-10, 1, 10}, new long[] {1, 13, 131});
  }
}
