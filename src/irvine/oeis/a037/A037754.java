package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037754 Base 7 digits are, in order, the first n terms of the periodic sequence with initial period 2,3,1,0.
 * @author Sean A. Irvine
 */
public class A037754 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037754() {
    super(1, new long[] {-7, 8, -8, 8}, new long[] {2, 17, 120, 840});
  }
}
