package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037603 Decimal expansion of a(n) is given by the first n terms of the periodic sequence with initial period 1,3,0.
 * @author Sean A. Irvine
 */
public class A037603 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037603() {
    super(1, new long[] {-10, 1, 0, 10}, new long[] {1, 13, 130, 1301});
  }
}
