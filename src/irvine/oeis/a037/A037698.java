package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037698 Base 7 digits are, in order, the first n terms of the periodic sequence with initial period 1,2,3,0.
 * @author Sean A. Irvine
 */
public class A037698 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037698() {
    super(new long[] {-7, 1, 0, 0, 7}, new long[] {1, 9, 66, 462, 3235});
  }
}
