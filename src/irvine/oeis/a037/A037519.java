package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037519 Decimal expansion of a(n) is given by the first n terms of the periodic sequence with initial period 2,0,1.
 * @author Sean A. Irvine
 */
public class A037519 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037519() {
    super(new long[] {-10, 1, 0, 10}, new long[] {2, 20, 201, 2012});
  }
}
