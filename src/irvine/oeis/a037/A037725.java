package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037725 Base 6 digits are, in order, the first n terms of the periodic sequence with initial period 2,0,3,1.
 * @author Sean A. Irvine
 */
public class A037725 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037725() {
    super(1, new long[] {-6, 1, 0, 0, 6}, new long[] {2, 12, 75, 451, 2708});
  }
}
