package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037718 Base 6 digits are, in order, the first n terms of the periodic sequence with initial period 2,0,1,3.
 * @author Sean A. Irvine
 */
public class A037718 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037718() {
    super(new long[] {-6, 7, -7, 7}, new long[] {2, 12, 73, 441});
  }
}
