package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037638 Decimal expansion of a(n) is given by the first n terms of the periodic sequence with initial period 2,1,3.
 * @author Sean A. Irvine
 */
public class A037638 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037638() {
    super(new long[] {-10, 1, 0, 10}, new long[] {2, 21, 213, 2132});
  }
}
