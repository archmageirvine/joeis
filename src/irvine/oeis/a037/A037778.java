package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037778 Decimal expansion of a(n) is given by the first n terms of the periodic sequence with initial period 3,1,0,2.
 * @author Sean A. Irvine
 */
public class A037778 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037778() {
    super(new long[] {-10, 11, -11, 11}, new long[] {3, 31, 310, 3102});
  }
}
