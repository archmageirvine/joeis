package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037680 Decimal expansion of a(n) is given by the first n terms of the periodic sequence with initial period 1,0,2,3.
 * @author Sean A. Irvine
 */
public class A037680 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037680() {
    super(new long[] {-10, 11, -11, 11}, new long[] {1, 10, 102, 1023});
  }
}
