package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037627 Base 6 digits are, in order, the first n terms of the periodic sequence with initial period 2,3,0.
 * @author Sean A. Irvine
 */
public class A037627 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037627() {
    super(1, new long[] {-6, 1, 0, 6}, new long[] {2, 15, 90, 542});
  }
}
