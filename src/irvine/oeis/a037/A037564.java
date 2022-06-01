package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037564 Base 7 digits are, in order, the first n terms of the periodic sequence with initial period 2,2,1.
 * @author Sean A. Irvine
 */
public class A037564 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037564() {
    super(new long[] {-7, 1, 0, 7}, new long[] {2, 16, 113, 793});
  }
}
