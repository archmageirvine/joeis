package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037740 Base-7 digits are, in order, the first n terms of the periodic sequence with initial period 2,1,3,0.
 * @author Sean A. Irvine
 */
public class A037740 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037740() {
    super(new long[] {-7, 1, 0, 0, 7}, new long[] {2, 15, 108, 756, 5294});
  }
}
