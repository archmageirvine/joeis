package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037728 Base 9 digits are, in order, the first n terms of the periodic sequence with initial period 2,0,3,1.
 * @author Sean A. Irvine
 */
public class A037728 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037728() {
    super(new long[] {-9, 1, 0, 0, 9}, new long[] {2, 18, 165, 1486, 13376});
  }
}
