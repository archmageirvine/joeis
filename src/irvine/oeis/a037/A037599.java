package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037599 Base 6 digits are, in order, the first n terms of the periodic sequence with initial period 1,3,0.
 * @author Sean A. Irvine
 */
public class A037599 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037599() {
    super(new long[] {-6, 1, 0, 6}, new long[] {1, 9, 54, 325});
  }
}
