package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037697 Base 6 digits are, in order, the first n terms of the periodic sequence with initial period 1,2,3,0.
 * @author Sean A. Irvine
 */
public class A037697 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037697() {
    super(new long[] {-6, 1, 0, 0, 6}, new long[] {1, 8, 51, 306, 1837});
  }
}
