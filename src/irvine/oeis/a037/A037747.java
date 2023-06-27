package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037747 Base 7 digits are, in order, the first n terms of the periodic sequence with initial period 2,3,0,1.
 * @author Sean A. Irvine
 */
public class A037747 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037747() {
    super(1, new long[] {-7, 1, 0, 0, 7}, new long[] {2, 17, 119, 834, 5840});
  }
}
