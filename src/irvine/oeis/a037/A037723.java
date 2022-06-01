package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037723 Base 4 digits are, in order, the first n terms of the periodic sequence with initial period 2,0,3,1.
 * @author Sean A. Irvine
 */
public class A037723 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037723() {
    super(new long[] {-4, 1, 0, 0, 4}, new long[] {2, 8, 35, 141, 566});
  }
}
