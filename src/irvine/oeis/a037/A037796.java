package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037796 Base 7 digits are, in order, the first n terms of the periodic sequence with initial period 3,2,1,0.
 * @author Sean A. Irvine
 */
public class A037796 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037796() {
    super(1, new long[] {-7, 1, 0, 0, 7}, new long[] {3, 23, 162, 1134, 7941});
  }
}
