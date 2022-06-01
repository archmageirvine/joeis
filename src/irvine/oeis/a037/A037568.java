package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037568 Base 3 digits are, in order, the first n terms of the periodic sequence with initial period 2,1,2.
 * @author Sean A. Irvine
 */
public class A037568 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037568() {
    super(new long[] {-3, 1, 0, 3}, new long[] {2, 7, 23, 71});
  }
}
