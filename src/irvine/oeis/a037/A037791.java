package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037791 Base 9 digits are, in order, the first n terms of the periodic sequence with initial period 3,2,0,1.
 * @author Sean A. Irvine
 */
public class A037791 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037791() {
    super(1, new long[] {-9, 10, -10, 10}, new long[] {3, 29, 261, 2350});
  }
}
