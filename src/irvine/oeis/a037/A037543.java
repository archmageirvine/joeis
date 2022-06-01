package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037543 Decimal expansion of a(n) is given by the first n terms of the periodic sequence with initial period 1,2,1.
 * @author Sean A. Irvine
 */
public class A037543 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037543() {
    super(new long[] {-10, 1, 0, 10}, new long[] {1, 12, 121, 1211});
  }
}
